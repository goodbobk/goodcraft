package com.gooddata.goodcraft.colors;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */

public class ColorBlock extends Block {

    private final static String BLOCK_NAME = "colorblock";

    public static String color;

    public ColorBlock () {
        super(Material.ground);
        setCreativeTab(CreativeTabs.tabBlock);

        setHardness(0.5f);
        setResistance(7f);
        setHarvestLevel("shovel",0);
    }
}
