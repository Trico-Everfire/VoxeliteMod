package com.tricoeverfire.voxelite.blocks;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;
import com.tricoeverfire.voxelite.init.ModBlocks;
import com.tricoeverfire.voxelite.init.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;

public class LiquidVoxeliteBlock extends BlockFluid{

	public LiquidVoxeliteBlock(String name, Fluid fluid, Material materialIn) {
		super(name, fluid, materialIn);
	
	}
	boolean once = true;


	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		
		if(!worldIn.isRemote) {
		
		if(entityIn instanceof EntityLivingBase) {
			
			float start = 5.0F;
			boolean unos = false;
			boolean dos = false;
			boolean tres = false;
			boolean quadre = false;
			
			EntityLivingBase entity = (EntityLivingBase) entityIn;
		
			List<ItemStack> armor = (List<ItemStack>) entity.getArmorInventoryList();
			Item boots = armor.get(0).getItem();
			Item leggings = armor.get(1).getItem();
			Item chestplate = armor.get(2).getItem();
			Item helmet = armor.get(3).getItem();
			
		
			
			if(boots == ModItems.AVOKINATE_BOOTS)
			{
				start -= 1.2f;
				unos = true;
			}
			if(leggings == ModItems.AVOKINATE_LEGGINGS)
			{
				start -= 1.2f;
				dos = true;
			}
			if(helmet == ModItems.AVOKINATE_HELMET)
			{
				start -= 1.2f;
				tres = true;
			}
			if(chestplate == ModItems.AVOKINATE_CHESTPLATE)
			{
				start -= 1.2f;
				quadre = true;
			}
			
			if(unos&&dos&&tres&&quadre) {
				return;
			}
		entityIn.attackEntityFrom(new EntityDamageSource("voxelized", entityIn), start);
		}
	
		if(!(entityIn instanceof EntityLivingBase)) {
			
			if(!(entityIn instanceof EntityItem)) {
				worldIn.removeEntity(entityIn);
				return;
			}
		
			EntityItem item = (EntityItem) entityIn;
			final Set<Item> IMMUNE =  Sets.newHashSet(ModItems.VOXELIZED_SLUDGE,ModItems.AVOKINATE_AXE,ModItems.AVOKINATE_PICKAXE,ModItems.AVOKINATE_HOE,ModItems.AVOKINATE_BOOTS,ModItems.AVOKINATE_CHESTPLATE,ModItems.AVOKINATE_CRYSTAL,ModItems.AVOKINATE_DUST,ModItems.AVOKINATE_HELMET,ModItems.AVOKINATE_LEGGINGS,ModItems.AVOKINATE_MEDAL,ModItems.AVOKINATE_SPADE,ModItems.AVOKINATE_SWORD,ModItems.CHARGED_AVOKINATE_AXE,ModItems.CHARGED_AVOKINATE_CRYSTAL,ModItems.CHARGED_AVOKINATE_HOE,ModItems.CHARGED_AVOKINATE_PICKAXE,ModItems.CHARGED_AVOKINATE_SPADE,ModItems.CHARGED_AVOKINATE_SWORD,Item.getItemFromBlock(ModBlocks.AVOKINATE_BLOCK),Item.getItemFromBlock(ModBlocks.AVOKINATE_ORE),Item.getItemFromBlock(ModBlocks.BLEACHED_BLOCK));
			
			
			if(item.getItem().getItem() != ModItems.VOXELIZED_SLUDGE  && !IMMUNE.contains(item.getItem().getItem())) {
			
			
			entityIn.entityDropItem(new ItemStack(ModItems.VOXELIZED_SLUDGE,item.getItem().getCount()), quantaFraction);
			worldIn.removeEntity(entityIn);
			return;
			}
			
		}
	}
	
		
		//super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
	}
	
}
