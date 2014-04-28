package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_55ff55 extends ColorBlock {

    public ColorBlock_55ff55() {
        super();
        color = "TMPL";
        setBlockName("colorblock_55ff55");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-55ff55");
        GameRegistry.registerBlock(this, "colorblock_55ff55");
    }
}
