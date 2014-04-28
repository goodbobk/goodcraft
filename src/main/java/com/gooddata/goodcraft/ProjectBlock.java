package com.gooddata.goodcraft;

import javafx.scene.media.VideoTrack;
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
public class ProjectBlock extends BlockContainer {
    static final String BLOCK_NAME = "projectblock";

    public ProjectBlock () {
        super(Material.ground);
        setCreativeTab(CreativeTabs.tabBlock);

        setHardness(0.5f);
        setResistance(7f);
        setBlockName(BLOCK_NAME);
        setBlockTextureName(GoodCraft.MOD_ID + ":" + BLOCK_NAME + "-lightgray");
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

        ProjectTileEntity te = (ProjectTileEntity) world.getTileEntity(x, y, z);
        te.vd = new ViewDirection(x,y,z, player);
        te.action(world, player);

        return true;
    }

    private MasterBlock findMaster(World world, int x, int y, int z) {
        for (int dx=-1; dx<=1;dx++) {
            for (int dz=-1; dz<=1; dz++) {
                if (Math.abs(dx) == Math.abs(dz)) continue;
                Block b = world.getBlock(x+dx, y, z+dz);
                if (b.getClass() == MasterBlock.class) {
                    System.out.println("FOUND");
                    return (MasterBlock)b;
                }
            }
        }
        System.out.println("NOTFOUND");
        return null;
    }

    public TileEntity createNewTileEntity(World var1, int var2) {
        return new ProjectTileEntity();
    }

}
