package com.gooddata.goodcraft.font;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class FontBlock_o extends FontBlock {

    public FontBlock_o() {
        super();
        letter = 'o';
        setBlockName("letterblock_o");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "letterblock-o");
        GameRegistry.registerBlock(this, "letterblock_o");
    }
}
