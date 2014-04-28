package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_00ff00 extends ColorBlock {

    public ColorBlock_00ff00() {
        super();
        color = "TMPL";
        setBlockName("colorblock_00ff00");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-00ff00");
        GameRegistry.registerBlock(this, "colorblock_00ff00");
    }
}
