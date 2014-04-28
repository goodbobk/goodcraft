package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_x extends FontBlock {

    public FontBlock_x() {
        super();
        letter = 'x';
        setBlockName("letterblock_x");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-x");
        GameRegistry.registerBlock(this, "letterblock_x");
    }
}
