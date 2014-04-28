package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_00ffaa extends ColorBlock {

    public ColorBlock_00ffaa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_00ffaa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-00ffaa");
        GameRegistry.registerBlock(this, "colorblock_00ffaa");
    }
}
