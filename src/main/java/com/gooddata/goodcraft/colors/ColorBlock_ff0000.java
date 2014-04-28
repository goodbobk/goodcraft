package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ff0000 extends ColorBlock {

    public ColorBlock_ff0000() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ff0000");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ff0000");
        GameRegistry.registerBlock(this, "colorblock_ff0000");
    }
}
