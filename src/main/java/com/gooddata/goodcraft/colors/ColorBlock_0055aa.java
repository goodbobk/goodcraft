package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_0055aa extends ColorBlock {

    public ColorBlock_0055aa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_0055aa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-0055aa");
        GameRegistry.registerBlock(this, "colorblock_0055aa");
    }
}
