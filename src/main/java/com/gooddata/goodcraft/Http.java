package com.gooddata.goodcraft;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.IOException;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class Http {

    static final String API = "https://secure.gooddata.com";

    private static CookieStore cookies = new BasicCookieStore();
    private CloseableHttpClient client;

    private static final String MIME_JSON = "application/json";

    public Http() {
        client = HttpClients
                .custom()
                .setDefaultCookieStore(cookies)
                .build();
    }

    private CloseableHttpResponse execute(HttpUriRequest request) throws IOException {
        System.out.println("REQUEST:" + request.getMethod() + " " + request.getURI());
        CloseableHttpResponse response;
        CloseableHttpClient cl = HttpClients
                .custom()
                .setDefaultCookieStore(cookies)
                .build();
        response = cl.execute(request);
        System.out.println("RESPONSE:" + response.getStatusLine());
        return response;
    }

    private CloseableHttpResponse execute(HttpUriRequest request, boolean refreshTT) throws IOException {
        int retryCount = 0;
        CloseableHttpResponse response = null;
        do {
            response = execute(request);
            if (response.getStatusLine().getStatusCode() != 401) {
                return response;
            }
        } while (refreshTT && retryCount++ < 1 && getTT());
        return response;
    }

    private boolean getTT() throws IOException {
        HttpGet req = new HttpGet(API + "/gdc/account/token");
        CloseableHttpResponse resp = execute(req);
        return resp.getStatusLine().getStatusCode() == 200;
    }

    public JSONObject post(String resource, String payload, boolean refreshTT) throws IOException {
        HttpPost req = new HttpPost(API + resource);

        req.setEntity(new StringEntity(payload));
        req.addHeader("Accept", "application/json");
        req.addHeader("Content-type", "application/json");
        CloseableHttpResponse response = execute(req, refreshTT);

        HttpEntity entity = response.getEntity();
        String s = EntityUtils.toString(entity);
        return (JSONObject)JSONValue.parse(s);
    }

    public boolean login() {
        try {
            HttpPost request = new HttpPost(API + "/gdc/account/login");
            request.addHeader("Content-type", "application/json");
            request.addHeader("Accept", "application/json");
            String payload = "{\"postUserLogin\":{\"login\":\"" + GoodCraft.username + "\",\"password\":\"" + GoodCraft.password + "\",\"remember\":1}}";
            System.out.println(payload);
            request.setEntity(new StringEntity(payload));
            CloseableHttpResponse response = execute(request, false);
            response.close();
            if (response.getStatusLine().getStatusCode() != 200) {
                return false;
            }
            return getTT();
        }
        catch (IOException e) {
            return false;
        }
    }

    public CloseableHttpResponse get(String resource, String accept) throws IOException {
        HttpGet req = new HttpGet(API + resource);

        req.addHeader("Accept", accept);

        CloseableHttpResponse response = null;
        return execute(req, true);
    }

    public JSONObject getJson(String resource) throws IOException, InterruptedException {
        return getJson(resource, 0);
    }


    public JSONObject getJson(String resource, long timeout) throws IOException, InterruptedException {
        long tMax = System.currentTimeMillis() + timeout * 1000;

        CloseableHttpResponse response = null;
        long wait = 0;
        int code;

        do {
            if (wait > 0) {
                Thread.sleep(wait);
            }
            response = get(resource, MIME_JSON);
            code = response.getStatusLine().getStatusCode();
            if (code != 202) {
                break;
            }
            if (wait < 10000) {
                wait += 500;
            }
        } while (System.currentTimeMillis() < tMax);

        if (code != 200) {
            return null;
        }
        HttpEntity entity = response.getEntity();
        String s = EntityUtils.toString(entity);
        return (JSONObject)JSONValue.parse(s);
    }

    public java.io.InputStream getStream(String resource, String accept) throws Exception {
        HttpGet request = new HttpGet(API + resource);
        request.addHeader("Accept", "*/*");
        CloseableHttpResponse response = execute(request);

        HttpEntity entity = response.getEntity();
        return entity.getContent();
    }

}
