package com.gooddata.goodcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.concurrent.Callable;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ReportTileEntity extends TileEntity {
    static final String id = "ReportTileEntity";

    int index;
    World world;
    ViewDirection vd;
    int currentIndex = 0;
    Http http;

    ReportInfo[] reports;

    public ReportTileEntity() {
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

    public void action(World world, EntityPlayer player) {
        if (++currentIndex >= reports.length) {
            currentIndex = 0;
        }
        ReportInfo report = reports[currentIndex];
        this.world = world;
        System.out.println(report.title + " " + report.link);
        GoodCraft.type(world, 10, vd.shift(0,1,0), report.title);

        int px = vd.x(0, 1);
        int py = vd.y();
        int pz = vd.z(0, 1);

        world.setBlock(px, py, pz, GoodCraft.chartBlock);
        ChartTileEntity cte = (ChartTileEntity)world.getTileEntity(px, py, pz);
        cte.report = report;
    }
}
