package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_l extends FontBlock {

    public FontBlock_l() {
        super();
        letter = 'l';
        setBlockName("letterblock_l");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-l");
        GameRegistry.registerBlock(this, "letterblock_l");
    }
}
