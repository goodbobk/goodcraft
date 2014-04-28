package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_5500ff extends ColorBlock {

    public ColorBlock_5500ff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_5500ff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-5500ff");
        GameRegistry.registerBlock(this, "colorblock_5500ff");
    }
}
