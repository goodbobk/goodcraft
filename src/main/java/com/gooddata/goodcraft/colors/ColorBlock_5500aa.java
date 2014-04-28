package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_5500aa extends ColorBlock {

    public ColorBlock_5500aa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_5500aa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-5500aa");
        GameRegistry.registerBlock(this, "colorblock_5500aa");
    }
}
