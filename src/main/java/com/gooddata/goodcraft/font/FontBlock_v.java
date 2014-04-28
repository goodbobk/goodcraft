package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_v extends FontBlock {

    public FontBlock_v() {
        super();
        letter = 'v';
        setBlockName("letterblock_v");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-v");
        GameRegistry.registerBlock(this, "letterblock_v");
    }
}
