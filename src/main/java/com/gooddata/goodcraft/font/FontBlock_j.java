package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_j extends FontBlock {

    public FontBlock_j() {
        super();
        letter = 'j';
        setBlockName("letterblock_j");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-j");
        GameRegistry.registerBlock(this, "letterblock_j");
    }
}
