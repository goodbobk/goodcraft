package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_q extends FontBlock {

    public FontBlock_q() {
        super();
        letter = 'q';
        setBlockName("letterblock_q");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-q");
        GameRegistry.registerBlock(this, "letterblock_q");
    }
}
