package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aa00aa extends ColorBlock {

    public ColorBlock_aa00aa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aa00aa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aa00aa");
        GameRegistry.registerBlock(this, "colorblock_aa00aa");
    }
}
