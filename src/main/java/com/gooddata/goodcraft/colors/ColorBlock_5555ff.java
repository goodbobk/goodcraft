package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_5555ff extends ColorBlock {

    public ColorBlock_5555ff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_5555ff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-5555ff");
        GameRegistry.registerBlock(this, "colorblock_5555ff");
    }
}
