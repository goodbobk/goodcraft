package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_g extends FontBlock {

    public FontBlock_g() {
        super();
        letter = 'g';
        setBlockName("letterblock_g");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-g");
        GameRegistry.registerBlock(this, "letterblock_g");
    }
}
