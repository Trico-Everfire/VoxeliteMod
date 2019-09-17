package com.tricoeverfire.voxelite.blocks;

import java.util.Random;

import com.tricoeverfire.voxelite.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CrackedReinforcedGlass extends BlockBase{

	public CrackedReinforcedGlass(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(1.0F);
		setResistance(15.0F);
		setLightOpacity(3);
		
		
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
	
	@Override
	  public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return ModItems.IRON_STICK;
	}
	
	
	@Override
	public int quantityDropped(Random random)
	{
		int max = 2;
		int min = 0;
		
	    return random.nextInt(max) + min;
	}
	
	
	
	@Override
	 protected boolean canSilkHarvest()
	{
	    return true;
	}
	

	@Override
    public boolean isOpaqueCube(IBlockState state) 
    {
		
        return false;
    
    }
	
	
	
	
    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();

      
      
            if (blockState != iblockstate)
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
			return false;
        

       
    }
	

	
}
