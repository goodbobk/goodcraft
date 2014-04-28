package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_000000 extends ColorBlock {

    public ColorBlock_000000() {
        super();
        color = "TMPL";
        setBlockName("colorblock_000000");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-000000");
        GameRegistry.registerBlock(this, "colorblock_000000");
    }
}
