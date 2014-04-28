package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ffff00 extends ColorBlock {

    public ColorBlock_ffff00() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ffff00");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ffff00");
        GameRegistry.registerBlock(this, "colorblock_ffff00");
    }
}
