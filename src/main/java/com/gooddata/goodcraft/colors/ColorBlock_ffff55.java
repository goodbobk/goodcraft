package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ffff55 extends ColorBlock {

    public ColorBlock_ffff55() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ffff55");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ffff55");
        GameRegistry.registerBlock(this, "colorblock_ffff55");
    }
}
