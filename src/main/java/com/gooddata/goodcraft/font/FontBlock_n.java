package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_n extends FontBlock {

    public FontBlock_n() {
        super();
        letter = 'n';
        setBlockName("letterblock_n");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-n");
        GameRegistry.registerBlock(this, "letterblock_n");
    }
}
