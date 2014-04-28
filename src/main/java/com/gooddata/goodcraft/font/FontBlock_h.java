package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_h extends FontBlock {

    public FontBlock_h() {
        super();
        letter = 'h';
        setBlockName("letterblock_h");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-h");
        GameRegistry.registerBlock(this, "letterblock_h");
    }
}
