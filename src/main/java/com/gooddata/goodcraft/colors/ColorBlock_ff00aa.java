package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ff00aa extends ColorBlock {

    public ColorBlock_ff00aa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ff00aa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ff00aa");
        GameRegistry.registerBlock(this, "colorblock_ff00aa");
    }
}
