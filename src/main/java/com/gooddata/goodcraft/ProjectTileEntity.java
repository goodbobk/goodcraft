package com.gooddata.goodcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ProjectTileEntity extends TileEntity {
    static final String id = "ProjectTileEntity";

    int index;
    World world;
    ViewDirection vd;
    int currentIndex = 0;
    Http http;

    ProjectInfo[] projects;
    Future<ReportInfo[]> reports = null;

    public ProjectTileEntity() {
        super();
        http = new Http();
        GoodCraft.executors.submit(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                boolean result = http.login();
                System.out.println("PRJ LOGIN:" + result);
                return result;
            }
        });
    }

    public void updateEntity() {
        super.updateEntity();

        if (reports != null && reports.isDone()) {
            try {
                int px = vd.x(0, 1);
                int py = vd.y();
                int pz = vd.z(0, 1);

                world.setBlock(px, py, pz, GoodCraft.reportBlock);
                ReportTileEntity rte = (ReportTileEntity)world.getTileEntity(px, py, pz);
                rte.reports = reports.get();
                reports = null;
            } catch (InterruptedException e) {
                System.out.println("UNEXPECTED1");
                e.printStackTrace();
            } catch (ExecutionException e) {
                System.out.println("UNEXPECTED2");
                e.printStackTrace();
            }
        }
    }

    public void action(World world, EntityPlayer player) {
        if (++currentIndex >= projects.length) {
            currentIndex = 0;
        }
        ProjectInfo project = projects[currentIndex];
        this.world = world;
        GoodCraft.type(world, 10, vd, project.title);

        int px = vd.x(0, 1);
        int py = vd.y();
        int pz = vd.z(0, 1);
        world.setBlock(px,py,pz, Blocks.air);
        reports = GoodCraft.executors.submit(new Callable<ReportInfo[]>() {
            @Override
            public ReportInfo[] call() throws Exception {
                ProjectInfo pi = projects[currentIndex];
                String resource = pi.link + "/query/reports";
                JSONObject query = http.getJson(resource);

                query = (JSONObject) query.get("query");
                JSONArray entries = (JSONArray) query.get("entries");

                ReportInfo[] reports = new ReportInfo[entries.size()];
                for (int i = 0; i < entries.size(); i++) {
                    JSONObject reportInfo = (JSONObject)entries.get(i);
                    ReportInfo ri = new ReportInfo();
                    ri.link = reportInfo.get("link").toString();
                    ri.title = reportInfo.get("title").toString();
                    reports[i] = ri;
                    System.out.println("PROJECT RPT: " + i + " => " + reports[i].title);
                }
                return reports;
            }
        });
    }
}



