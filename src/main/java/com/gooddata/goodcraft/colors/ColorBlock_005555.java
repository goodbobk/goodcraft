package com.gooddata.goodcraft.colors;

import com.gooddata.goodcraft.GoodCraft;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ColorBlock_005555 extends ColorBlock {

    public ColorBlock_005555() {
        super();
        color = "TMPL";
        setBlockName("colorblock_005555");
        setBlockTextureName(GoodCraft.MOD_ID + ":" + "colorblock-005555");
        GameRegistry.registerBlock(this, "colorblock_005555");
    }
}
