package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aaffff extends ColorBlock {

    public ColorBlock_aaffff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aaffff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aaffff");
        GameRegistry.registerBlock(this, "colorblock_aaffff");
    }
}
