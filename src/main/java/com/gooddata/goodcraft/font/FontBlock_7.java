package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_7 extends FontBlock {

    public FontBlock_7() {
        super();
        letter = '7';
        setBlockName("letterblock_7");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-7");
        GameRegistry.registerBlock(this, "letterblock_7");
    }
}
