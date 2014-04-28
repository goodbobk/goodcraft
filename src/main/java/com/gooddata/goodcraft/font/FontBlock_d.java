package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_d extends FontBlock {

    public FontBlock_d() {
        super();
        letter = 'd';
        setBlockName("letterblock_d");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-d");
        GameRegistry.registerBlock(this, "letterblock_d");
    }
}
