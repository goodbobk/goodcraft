package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_0 extends FontBlock {

    public FontBlock_0() {
        super();
        letter = '0';
        setBlockName("letterblock_0");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-0");
        GameRegistry.registerBlock(this, "letterblock_0");
    }
}
