package com.gooddata.goodcraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by bohumil.koutsky on 11/04/14.
 */
public class ReportBlock extends BlockContainer {
    static final String BLOCK_NAME = "reportblock";

    public ReportBlock () {
        super(Material.ground);
        setCreativeTab(CreativeTabs.tabBlock);

        setHardness(0.5f);
        setResistance(7f);
        setBlockName(BLOCK_NAME);
        setBlockTextureName(GoodCraft.MOD_ID + ":" + BLOCK_NAME + "-darkgray");
        setHarvestLevel("shovel",0);
    }


    // Attack
//    @Override
//    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
//        world.setBlock(x, y, z + 1, Blocks.sand);
//    }

    // Use
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z,
                                    EntityPlayer player, int metadata, float what, float these, float are) {

        ReportTileEntity te = (ReportTileEntity) world.getTileEntity(x, y, z);
        te.vd = new ViewDirection(x,y,z, player);
        te.action(world, player);

        return true;
    }

    public TileEntity createNewTileEntity(World var1, int var2) {
        return new ReportTileEntity();
    }
}
