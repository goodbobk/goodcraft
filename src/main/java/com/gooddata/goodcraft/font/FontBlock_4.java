package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_4 extends FontBlock {

    public FontBlock_4() {
        super();
        letter = '4';
        setBlockName("letterblock_4");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-4");
        GameRegistry.registerBlock(this, "letterblock_4");
    }
}
