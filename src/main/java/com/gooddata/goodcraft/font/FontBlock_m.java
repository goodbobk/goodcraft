package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_m extends FontBlock {

    public FontBlock_m() {
        super();
        letter = 'm';
        setBlockName("letterblock_m");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-m");
        GameRegistry.registerBlock(this, "letterblock_m");
    }
}
