package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_3 extends FontBlock {

    public FontBlock_3() {
        super();
        letter = '3';
        setBlockName("letterblock_3");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-3");
        GameRegistry.registerBlock(this, "letterblock_3");
    }
}
