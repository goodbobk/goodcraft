package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_6 extends FontBlock {

    public FontBlock_6() {
        super();
        letter = '6';
        setBlockName("letterblock_6");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-6");
        GameRegistry.registerBlock(this, "letterblock_6");
    }
}
