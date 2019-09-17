package com.tricoeverfire.voxelite.items.tools;

import com.tricoeverfire.voxelite.Main;
import com.tricoeverfire.voxelite.init.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ToolArrow extends ItemArrow{

	public ToolArrow(String name){
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(Main.voxelitemod);
	
	ModItems.ITEMS.add(this);
	}
	//@Override
	//public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) 
	//{
	//	EntityDiamondArrow entityDiamondArrow = new EntityDiamondArrow(worldIn, shooter);
	//	return entityDiamondArrow;
	//}
}
