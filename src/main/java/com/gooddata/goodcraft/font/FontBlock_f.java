package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_f extends FontBlock {

    public FontBlock_f() {
        super();
        letter = 'f';
        setBlockName("letterblock_f");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-f");
        GameRegistry.registerBlock(this, "letterblock_f");
    }
}
