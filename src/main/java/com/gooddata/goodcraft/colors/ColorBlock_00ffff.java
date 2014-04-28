package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_00ffff extends ColorBlock {

    public ColorBlock_00ffff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_00ffff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-00ffff");
        GameRegistry.registerBlock(this, "colorblock_00ffff");
    }
}
