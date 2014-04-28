package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_e extends FontBlock {

    public FontBlock_e() {
        super();
        letter = 'e';
        setBlockName("letterblock_e");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-e");
        GameRegistry.registerBlock(this, "letterblock_e");
    }
}
