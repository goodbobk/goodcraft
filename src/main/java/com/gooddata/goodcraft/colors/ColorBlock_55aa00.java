package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_55aa00 extends ColorBlock {

    public ColorBlock_55aa00() {
        super();
        color = "TMPL";
        setBlockName("colorblock_55aa00");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-55aa00");
        GameRegistry.registerBlock(this, "colorblock_55aa00");
    }
}
