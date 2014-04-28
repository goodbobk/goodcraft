package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_005500 extends ColorBlock {

    public ColorBlock_005500() {
        super();
        color = "TMPL";
        setBlockName("colorblock_005500");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-005500");
        GameRegistry.registerBlock(this, "colorblock_005500");
    }
}
