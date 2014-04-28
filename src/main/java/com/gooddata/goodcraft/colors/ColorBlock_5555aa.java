package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_5555aa extends ColorBlock {

    public ColorBlock_5555aa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_5555aa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-5555aa");
        GameRegistry.registerBlock(this, "colorblock_5555aa");
    }
}
