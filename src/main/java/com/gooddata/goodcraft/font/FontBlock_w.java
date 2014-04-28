package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_w extends FontBlock {

    public FontBlock_w() {
        super();
        letter = 'w';
        setBlockName("letterblock_w");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-w");
        GameRegistry.registerBlock(this, "letterblock_w");
    }
}
