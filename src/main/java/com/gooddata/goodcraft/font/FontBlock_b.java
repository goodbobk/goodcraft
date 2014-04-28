package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_b extends FontBlock {

    public FontBlock_b() {
        super();
        letter = 'b';
        setBlockName("letterblock_b");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-b");
        GameRegistry.registerBlock(this, "letterblock_b");
    }
}
