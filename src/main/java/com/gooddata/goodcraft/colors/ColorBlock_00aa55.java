package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_00aa55 extends ColorBlock {

    public ColorBlock_00aa55() {
        super();
        color = "TMPL";
        setBlockName("colorblock_00aa55");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-00aa55");
        GameRegistry.registerBlock(this, "colorblock_00aa55");
    }
}
