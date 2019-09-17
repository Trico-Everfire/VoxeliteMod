package com.tricoeverfire.voxelite.items.tools;

import java.util.List;
import java.util.Random;
import java.util.Set;

import com.google.common.collect.Sets;
import com.tricoeverfire.voxelite.init.ModBlocks;
import com.tricoeverfire.voxelite.init.ModItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AvokinatePickaxe extends ToolPickaxe {

	
	
	//private static final Set<IBlockState> AVOKINATE_EFFECTIVE_ON =  Sets.newHashSet(ModBlocks.AVOKINATE_ORE.getDefaultState(),ModBlocks.BLEACHED_BLOCK.getDefaultState());
	
	
	public AvokinatePickaxe(String name, ToolMaterial material) {
		super(name, material);

	}
	
	@Override
	//@SideOnly(Side.SERVER)
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
		
		
		System.out.println(stack.getEnchantmentTagList().getId());
		//boolean once = true;
		int max = 5;
		int min = 0;
		Random random = new Random();
		int result = random.nextInt(max) + min;
		System.out.println(result);
		if(!worldIn.isRemote) {
		if(result == 4 && state.getBlock().getDefaultState() == ModBlocks.AVOKINATE_ORE.getDefaultState()) {
		worldIn.spawnEntity(new EntityItem(worldIn,pos.getX(),pos.getY(),pos.getZ(),new ItemStack(ModItems.CHARGED_AVOKINATE_CRYSTAL,1)));	
		entityLiving.sendMessage(new TextComponentString("You felt a strange crystal resonating from the ore."));
		
		return true;
		}		
		}
		return false;
	
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		// TODO Auto-generated method stub
		tooltip.add("Mines Voxelized blocks faster");
		tooltip.add("Is immune to Voxelization");
		tooltip.add("Avokinate Ore has a change to drop Charged Crystals");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	
	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) {
		final Set<IBlockState> AVOKINATE_EFFECTIVE_ON =  Sets.newHashSet(ModBlocks.AVOKINATE_ORE.getDefaultState(),ModBlocks.BLEACHED_BLOCK.getDefaultState());

		if(AVOKINATE_EFFECTIVE_ON.contains(state.getBlock().getDefaultState())) {
						
			return 25.0F;
		}
		
		return 15.0F;
	}
	
	
}
