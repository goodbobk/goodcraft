package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_wtf extends FontBlock {

    public FontBlock_wtf() {
        super();
        letter = '?';
        setBlockName("letterblock_wtf");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-wtf");
        GameRegistry.registerBlock(this, "letterblock_wtf");
    }
}
