package com.gooddata.goodcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class MasterTileEntity extends TileEntity {
    static final String id = "GoodCraftTileEntity";

    Future<ProjectInfo[]> projects;
    boolean loggedIn = false;
    World world;
    ViewDirection vd;
    Http http;

    public MasterTileEntity() {
        super();
        http = new Http();
        GoodCraft.executors.submit(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                boolean result = http.login();
                System.out.println("LOGIN:" + result);
                loggedIn = result;
                return result;
            }
        });
    }

    public void updateEntity() {
        super.updateEntity();

        if (projects != null && projects.isDone()) {
            try {
                int px = vd.x(0, 1);
                int py = vd.y();
                int pz = vd.z(0, 1);

                world.setBlock(px, py, pz, GoodCraft.projectBlock);
                ProjectTileEntity pte = (ProjectTileEntity)world.getTileEntity(px, py, pz);
                pte.projects = projects.get();

                projects = null;
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
        if (!loggedIn) {
            System.out.println("ERROR: Not Logged In");
            player.setFire(1000);
            return;
        }
        this.world = world;
        projects = GoodCraft.executors.submit(new Callable<ProjectInfo[]>() {
            @Override
            public ProjectInfo[] call() throws Exception {
                JSONObject md = http.getJson("/gdc/md");
                JSONObject about = (JSONObject) md.get("about");
                JSONArray links = (JSONArray)about.get("links");
                ProjectInfo[] projects = new ProjectInfo[links.size()];
                for (int i = 0; i<links.size(); i++) {
                    JSONObject projectInfo = (JSONObject)links.get(i);
                    ProjectInfo pi = new ProjectInfo();
                    pi.link = projectInfo.get("link").toString();
                    pi.title = projectInfo.get("title").toString();
                    projects[i] = pi;
                    System.out.println("MASTER PRJ: " + i + " => " + projects[i]);
                }
                return projects;
            }
        });
    }
}
