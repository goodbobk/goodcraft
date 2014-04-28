package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_00aaff extends ColorBlock {

    public ColorBlock_00aaff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_00aaff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-00aaff");
        GameRegistry.registerBlock(this, "colorblock_00aaff");
    }
}
