package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_a extends FontBlock {

    public FontBlock_a() {
        super();
        letter = 'a';
        setBlockName("letterblock_a");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-a");
        GameRegistry.registerBlock(this, "letterblock_a");
    }
}
