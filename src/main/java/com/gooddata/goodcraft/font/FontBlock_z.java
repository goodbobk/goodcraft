package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_z extends FontBlock {

    public FontBlock_z() {
        super();
        letter = 'z';
        setBlockName("letterblock_z");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-z");
        GameRegistry.registerBlock(this, "letterblock_z");
    }
}
