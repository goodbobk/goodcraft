package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_55aaff extends ColorBlock {

    public ColorBlock_55aaff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_55aaff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-55aaff");
        GameRegistry.registerBlock(this, "colorblock_55aaff");
    }
}
