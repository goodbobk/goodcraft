package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_55ffaa extends ColorBlock {

    public ColorBlock_55ffaa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_55ffaa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-55ffaa");
        GameRegistry.registerBlock(this, "colorblock_55ffaa");
    }
}
