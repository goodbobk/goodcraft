package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_u extends FontBlock {

    public FontBlock_u() {
        super();
        letter = 'u';
        setBlockName("letterblock_u");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-u");
        GameRegistry.registerBlock(this, "letterblock_u");
    }
}
