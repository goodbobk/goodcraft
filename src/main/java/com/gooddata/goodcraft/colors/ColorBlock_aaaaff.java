package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aaaaff extends ColorBlock {

    public ColorBlock_aaaaff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aaaaff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aaaaff");
        GameRegistry.registerBlock(this, "colorblock_aaaaff");
    }
}
