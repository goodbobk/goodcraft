package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_aa55ff extends ColorBlock {

    public ColorBlock_aa55ff() {
        super();
        color = "TMPL";
        setBlockName("colorblock_aa55ff");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-aa55ff");
        GameRegistry.registerBlock(this, "colorblock_aa55ff");
    }
}
