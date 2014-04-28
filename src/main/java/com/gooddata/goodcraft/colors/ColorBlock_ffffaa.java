package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ffffaa extends ColorBlock {

    public ColorBlock_ffffaa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ffffaa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ffffaa");
        GameRegistry.registerBlock(this, "colorblock_ffffaa");
    }
}
