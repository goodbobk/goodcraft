package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_550055 extends ColorBlock {

    public ColorBlock_550055() {
        super();
        color = "TMPL";
        setBlockName("colorblock_550055");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-550055");
        GameRegistry.registerBlock(this, "colorblock_550055");
    }
}
