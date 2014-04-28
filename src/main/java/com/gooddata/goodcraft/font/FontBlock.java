package com.gooddata.goodcraft.font;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */

public class FontBlock extends Block {

    private final static String BLOCK_NAME = "letterblock";

    public static char letter;

    public FontBlock () {
        super(Material.ground);
        setCreativeTab(CreativeTabs.tabBlock);

        String name;
        setHardness(0.5f);
        setResistance(7f);
        setHarvestLevel("shovel",0);
    }
}