package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ffaaff extends ColorBlock {

    public ColorBlock_ffaaff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ffaaff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ffaaff");
        GameRegistry.registerBlock(this, "colorblock_ffaaff");
    }
}
