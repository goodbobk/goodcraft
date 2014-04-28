package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_y extends FontBlock {

    public FontBlock_y() {
        super();
        letter = 'y';
        setBlockName("letterblock_y");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-y");
        GameRegistry.registerBlock(this, "letterblock_y");
    }
}
