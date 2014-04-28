package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aaaa55 extends ColorBlock {

    public ColorBlock_aaaa55() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aaaa55");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aaaa55");
        GameRegistry.registerBlock(this, "colorblock_aaaa55");
    }
}
