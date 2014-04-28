package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_k extends FontBlock {

    public FontBlock_k() {
        super();
        letter = 'k';
        setBlockName("letterblock_k");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-k");
        GameRegistry.registerBlock(this, "letterblock_k");
    }
}
