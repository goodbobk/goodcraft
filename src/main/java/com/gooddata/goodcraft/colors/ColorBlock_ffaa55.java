package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ffaa55 extends ColorBlock {

    public ColorBlock_ffaa55() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ffaa55");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ffaa55");
        GameRegistry.registerBlock(this, "colorblock_ffaa55");
    }
}
