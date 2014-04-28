package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_ff5555 extends ColorBlock {

    public ColorBlock_ff5555() {
        super();
        color = "TMPL";
        setBlockName("colorblock_ff5555");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-ff5555");
        GameRegistry.registerBlock(this, "colorblock_ff5555");
    }
}
