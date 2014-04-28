package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aa0000 extends ColorBlock {

    public ColorBlock_aa0000() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aa0000");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aa0000");
        GameRegistry.registerBlock(this, "colorblock_aa0000");
    }
}
