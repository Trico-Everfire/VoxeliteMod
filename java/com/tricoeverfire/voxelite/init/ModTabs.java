package com.tricoeverfire.voxelite.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTabs extends CreativeTabs{

	public ModTabs(String label) {
		super("voxelitemod");
		// TODO Auto-generated constructor stub
		//displayAllRelevantItems();
	}

	
	public ItemStack getTabIconItem() {
	
		return new ItemStack(ModItems.OMEGA_BERRY);
	}
	

}
