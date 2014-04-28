package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_55ffff extends ColorBlock {

    public ColorBlock_55ffff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_55ffff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-55ffff");
        GameRegistry.registerBlock(this, "colorblock_55ffff");
    }
}
