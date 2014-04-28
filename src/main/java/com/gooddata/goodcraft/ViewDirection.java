package com.gooddata.goodcraft;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ViewDirection {

    public int para_x;
    public int para_z;
    int anchor_x;
    int anchor_y;
    int anchor_z;

    private ViewDirection(ViewDirection vd) {
        this.para_x = vd.para_x;
        this.para_z = vd.para_z;
        this.anchor_x = vd.anchor_x;
        this.anchor_y = vd.anchor_y;
        this.anchor_z = vd.anchor_z;
    }

    public ViewDirection(int anchor_x, int anchor_y, int anchor_z, EntityPlayer player) {
        double offset_x = (double)anchor_x + 0.5d - player.posX;
        double offset_z = (double)anchor_z + 0.5d - player.posZ;
        if (Math.abs(offset_x) > Math.abs(offset_z)) {
            para_x = (int)Math.signum(offset_x);
            para_z = 0;
        }
        else {
            para_x = 0;
            para_z = (int)Math.signum(offset_z);;
        }
        this.anchor_x = anchor_x;
        this.anchor_y = anchor_y;
        this.anchor_z = anchor_z;
    }

    public int x(int para, int perp) {
        return anchor_x + para * para_x - perp * para_z;
    }

    public int y() {
        return anchor_y;
    }

    public int z(int para, int perp) {
        return anchor_z + para * para_z + perp * para_x;
    }

    public ViewDirection shift(int x, int y, int z) {
        ViewDirection vd = new ViewDirection(this);
        vd.anchor_x += x;
        vd.anchor_y += y;
        vd.anchor_z += z;
        return vd;
    }
}
