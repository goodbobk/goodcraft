package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aa00ff extends ColorBlock {

    public ColorBlock_aa00ff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aa00ff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aa00ff");
        GameRegistry.registerBlock(this, "colorblock_aa00ff");
    }
}
