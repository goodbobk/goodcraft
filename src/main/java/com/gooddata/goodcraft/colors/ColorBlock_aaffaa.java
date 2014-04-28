package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aaffaa extends ColorBlock {

    public ColorBlock_aaffaa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aaffaa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aaffaa");
        GameRegistry.registerBlock(this, "colorblock_aaffaa");
    }
}
