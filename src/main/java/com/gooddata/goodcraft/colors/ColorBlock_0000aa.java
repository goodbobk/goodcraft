package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_0000aa extends ColorBlock {

    public ColorBlock_0000aa() {
        super();
        color = "TMPL";
        setBlockName("colorblock_0000aa");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-0000aa");
        GameRegistry.registerBlock(this, "colorblock_0000aa");
    }
}
