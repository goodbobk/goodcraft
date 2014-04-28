package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ff55aa extends ColorBlock {

    public ColorBlock_ff55aa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ff55aa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ff55aa");
        GameRegistry.registerBlock(this, "colorblock_ff55aa");
    }
}
