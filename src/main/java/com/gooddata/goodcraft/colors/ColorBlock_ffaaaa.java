package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ffaaaa extends ColorBlock {

    public ColorBlock_ffaaaa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ffaaaa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ffaaaa");
        GameRegistry.registerBlock(this, "colorblock_ffaaaa");
    }
}
