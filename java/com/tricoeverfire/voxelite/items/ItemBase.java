package com.tricoeverfire.voxelite.items;

import com.tricoeverfire.voxelite.Main;
import com.tricoeverfire.voxelite.init.ModItems;
import com.tricoeverfire.voxelite.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		//setCreativeTab(Main.voxilitemod);
		setCreativeTab(Main.voxelitemod);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		}

}
