package com.gooddata.goodcraft;

/**
 * Created by bohumil.koutsky on 10/04/14.
 */


import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MasterBlock extends BlockContainer {

    static final String BLOCK_NAME = "masterblock";

    public MasterBlock () {
        super(Material.ground);
        setCreativeTab(CreativeTabs.tabBlock);

        setHardness(0.5f);
        setResistance(7f);
        setBlockName(BLOCK_NAME);
        setBlockTextureName(GoodCraft.MOD_ID + ":" + BLOCK_NAME + "-white");
        setHarvestLevel("shovel",0);
    }

    // Use
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z,
                                    EntityPlayer player, int metadata, float what, float these, float are) {

        MasterTileEntity te = (MasterTileEntity) world.getTileEntity(x, y, z);
        te.vd = new ViewDirection(x,y,z, player);
        te.world = world;
        te.action(world, player);

        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new MasterTileEntity();
    }


}
