package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_0000ff extends ColorBlock {

    public ColorBlock_0000ff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_0000ff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-0000ff");
        GameRegistry.registerBlock(this, "colorblock_0000ff");
    }
}
