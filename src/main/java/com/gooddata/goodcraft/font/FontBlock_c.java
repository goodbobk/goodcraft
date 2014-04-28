package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_c extends FontBlock {

    public FontBlock_c() {
        super();
        letter = 'c';
        setBlockName("letterblock_c");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-c");
        GameRegistry.registerBlock(this, "letterblock_c");
    }
}
