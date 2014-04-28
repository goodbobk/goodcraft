package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_t extends FontBlock {

    public FontBlock_t() {
        super();
        letter = 't';
        setBlockName("letterblock_t");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-t");
        GameRegistry.registerBlock(this, "letterblock_t");
    }
}
