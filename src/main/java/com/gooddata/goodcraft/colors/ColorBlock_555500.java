package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_555500 extends ColorBlock {

    public ColorBlock_555500() {
        super();
        color = "TMPL";
        setBlockName("colorblock_555500");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-555500");
        GameRegistry.registerBlock(this, "colorblock_555500");
    }
}
