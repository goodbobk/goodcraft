package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_55aaaa extends ColorBlock {

    public ColorBlock_55aaaa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_55aaaa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-55aaaa");
        GameRegistry.registerBlock(this, "colorblock_55aaaa");
    }
}
