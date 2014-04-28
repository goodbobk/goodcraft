package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aaaaaa extends ColorBlock {

    public ColorBlock_aaaaaa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aaaaaa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aaaaaa");
        GameRegistry.registerBlock(this, "colorblock_aaaaaa");
    }
}
