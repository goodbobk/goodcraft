package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_r extends FontBlock {

    public FontBlock_r() {
        super();
        letter = 'r';
        setBlockName("letterblock_r");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-r");
        GameRegistry.registerBlock(this, "letterblock_r");
    }
}
