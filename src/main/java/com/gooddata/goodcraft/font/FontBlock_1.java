package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_1 extends FontBlock {

    public FontBlock_1() {
        super();
        letter = '1';
        setBlockName("letterblock_1");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-1");
        GameRegistry.registerBlock(this, "letterblock_1");
    }
}
