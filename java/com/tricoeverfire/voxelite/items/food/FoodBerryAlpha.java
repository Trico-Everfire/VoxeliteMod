package com.tricoeverfire.voxelite.items.food;

import com.tricoeverfire.voxelite.init.ModBlocks;
import com.tricoeverfire.voxelite.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class FoodBerryAlpha extends FoodItem implements IHasModel, IPlantable{

	public FoodBerryAlpha(String name, int amount, boolean isWolfFood) {
		super(name, amount, isWolfFood);
		 this.setAlwaysEdible();
		//setPotionEffect(potionId, potionEffectProbability);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player,World worldin,BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float HitZ) {
		ItemStack stack = player.getHeldItem(hand);
		IBlockState state =worldin.getBlockState(pos);
		if(facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, worldin, pos, EnumFacing.UP, this)&&worldin.isAirBlock(pos.up())) {
			worldin.setBlockState(pos.up(), ModBlocks.ALPHA_BERRY_PLANT.getDefaultState());
			stack.shrink(1);
			return EnumActionResult.SUCCESS;
		}
		else return EnumActionResult.FAIL;
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {


		
		return EnumPlantType.Crop;
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return ModBlocks.ALPHA_BERRY_PLANT.getDefaultState();
		//return null;
	}



	
	

}
