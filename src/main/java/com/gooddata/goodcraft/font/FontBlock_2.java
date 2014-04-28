package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_2 extends FontBlock {

    public FontBlock_2() {
        super();
        letter = '2';
        setBlockName("letterblock_2");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-2");
        GameRegistry.registerBlock(this, "letterblock_2");
    }
}
