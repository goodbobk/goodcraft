package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ffffff extends ColorBlock {

    public ColorBlock_ffffff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ffffff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ffffff");
        GameRegistry.registerBlock(this, "colorblock_ffffff");
    }
}
