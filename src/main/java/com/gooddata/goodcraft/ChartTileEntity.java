package com.gooddata.goodcraft;

import ar.com.hjg.pngj.ImageLineInt;
import ar.com.hjg.pngj.PngReader;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ChartTileEntity extends TileEntity {
    static final String id = "ChartTileEntity";

    static final int WIDTH = 200;
    static final int HEIGHT = 160;
    static final int DISTANCE = 80;

    int index;
    World world;
    ViewDirection vd;
    int currentIndex = 0;
    Http http;

    Block[][] blockMap = null;
    ReportInfo report;

    Future<Boolean> renderer;

    public ChartTileEntity() {
        super();
        http = new Http();
        GoodCraft.executors.submit(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                boolean result = http.login();
                System.out.println("REPORT LOGIN:" + result);
                return result;
            }
        });
    }

    String roundedColor(int color) {
        if (color <= 0x2a) {
            return "00";
        }
        else if (color <= 0x7f) {
            return "55";
        }
        else if (color <= 0xd4) {
            return "aa";
        }
        else {
            return "ff";
        }
    }
    public boolean render(InputStream is) {
        Block[][] bm;

        PngReader pngr = new PngReader(is);
        pngr.getChunksList();
        System.out.println(pngr.imgInfo.rows + "x" + pngr.imgInfo.cols + " channels: " + pngr.imgInfo.channels);
        bm = new Block[pngr.imgInfo.rows][];
        int ch = pngr.imgInfo.channels;

        for (int row = 0; row < pngr.imgInfo.rows; row++) {
            bm[row] = new Block[pngr.imgInfo.cols];
            ImageLineInt line = (ImageLineInt)pngr.readRow();
            int[] scanline = line.getScanline();
            for (int col = 0; col < pngr.imgInfo.cols; col++) {
                String r = roundedColor(scanline[col * ch]);
                String g = roundedColor(scanline[col * ch + 1]);
                String b = roundedColor(scanline[col * ch + 2]);
                int alpha;
                if (ch == 4) {
                    alpha = scanline[col * ch + 3];
                }
                else {
                    alpha = 255;
                }
                if (alpha < 50) {
                    bm[row][col] = Blocks.air;
                }
                else {
                    Block block = GoodCraft.colors.get(r+g+b);
                    if (block == null) {
                        System.out.println("No block for " + r + g + b);
                        block = Blocks.air;
                    }
                    bm[row][col] = block;
                }

            }
        }
        blockMap = bm;
        pngr.end();
        return true;
    }

    public void updateEntity() {
        super.updateEntity();

        if (blockMap != null) {
            for (int row = 0; row < blockMap.length; row++) {
                for (int col = 0; col < blockMap[row].length; col++) {
                    world.setBlock(vd.x(DISTANCE, -WIDTH / 2 + col), vd.y() + HEIGHT / 2 - row, vd.z(DISTANCE, -WIDTH / 2 + col), blockMap[row][col]);
                }
            }
            blockMap = null;
        }
    }

    public void action(World world, EntityPlayer player) {
        this.world = world;
//        System.out.println("RENDERING: " + report.title + " " + report.link);
        renderer = GoodCraft.executors.submit(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                String r = report.link;
                String project = r.substring(8, r.indexOf('/', 8));
                String payload = "{\n" +
                        "  \"report_req\": {" +
                        "    \"report\":\"" + r + "\"," +
                        "    \"context\": {" +
                        "      \"imageSpecification\":{\"sizeX\":" + WIDTH + "," +
                        "      \"sizeY\":" + HEIGHT + "}" +
                        "    }" +
                        "  }" +
                        "}";

                JSONObject result = http.post("/gdc/app/projects/" + project + "/execute", payload, true);

                JSONObject execResult = (JSONObject)result.get("execResult");
                System.out.println("YYY");

                if (!execResult.containsKey("imageResult")) {
                    return null;
                }

                String imageResult = execResult.get("imageResult").toString();
                System.out.println("ZZZ");

                JSONObject js = http.getJson(imageResult, 30000);

                js = (JSONObject)js.get("imageResult");
                String image = js.get("image").toString();
                System.out.println("image: " + image);

                InputStream is = http.getStream(image, "image/png");
                return render(is);
            }
        });
    }
}
