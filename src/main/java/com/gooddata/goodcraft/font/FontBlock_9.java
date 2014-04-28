package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_9 extends FontBlock {

    public FontBlock_9() {
        super();
        letter = '9';
        setBlockName("letterblock_9");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-9");
        GameRegistry.registerBlock(this, "letterblock_9");
    }
}
