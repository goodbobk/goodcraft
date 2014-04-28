package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_p extends FontBlock {

    public FontBlock_p() {
        super();
        letter = 'p';
        setBlockName("letterblock_p");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-p");
        GameRegistry.registerBlock(this, "letterblock_p");
    }
}
