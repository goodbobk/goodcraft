package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_8 extends FontBlock {

    public FontBlock_8() {
        super();
        letter = '8';
        setBlockName("letterblock_8");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-8");
        GameRegistry.registerBlock(this, "letterblock_8");
    }
}
