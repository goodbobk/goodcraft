package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_s extends FontBlock {

    public FontBlock_s() {
        super();
        letter = 's';
        setBlockName("letterblock_s");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-s");
        GameRegistry.registerBlock(this, "letterblock_s");
    }
}
