package com.tricoeverfire.voxelite.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.tricoeverfire.voxelite.init.ModBlocks;
import com.tricoeverfire.voxelite.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockOmegaPlant extends BlockCrops {
	
	public BlockOmegaPlant(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		int max = 3;
		int min = 1;
		Random random = new Random();
		
	if(!worldIn.isRemote) {
		if(this.isMaxAge(state)) {
			worldIn.spawnEntity(new EntityItem(worldIn,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ModItems.OMEGA_BERRY,1)));
			worldIn.setBlockState(pos,this.withAge(0));
			return true;
			
		}
	}
	return false;
	}
	
	
@Override
protected Item getSeed() {
	return ModItems.OMEGA_BERRY;
}
@Override
protected Item getCrop() {
	return ModItems.OMEGA_BERRY;
}
@Override
public int quantityDropped(Random random) {
	int max = 3;
	int min = 1;
	
	return random.nextInt(max) - min;
}

//@Override
// public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	// fix bounding box system.
	//return super.getBoundingBox(state, source, pos);
//}
}
