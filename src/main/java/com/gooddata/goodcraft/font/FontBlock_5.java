package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_5 extends FontBlock {

    public FontBlock_5() {
        super();
        letter = '5';
        setBlockName("letterblock_5");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-5");
        GameRegistry.registerBlock(this, "letterblock_5");
    }
}
