package com.tricoeverfire.voxelite.items.tools;

import com.tricoeverfire.voxelite.Main;
import com.tricoeverfire.voxelite.init.ModItems;
import com.tricoeverfire.voxelite.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;

public class ToolShears extends ItemShears implements IHasModel{

	public ToolShears(String name) {
		
		//super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.voxelitemod);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
	
}
