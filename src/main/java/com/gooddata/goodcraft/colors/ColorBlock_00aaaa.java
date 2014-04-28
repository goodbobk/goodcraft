package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_00aaaa extends ColorBlock {

    public ColorBlock_00aaaa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_00aaaa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-00aaaa");
        GameRegistry.registerBlock(this, "colorblock_00aaaa");
    }
}
