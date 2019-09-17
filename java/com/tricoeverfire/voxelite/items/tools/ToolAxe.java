package com.tricoeverfire.voxelite.items.tools;

import com.tricoeverfire.voxelite.Main;
import com.tricoeverfire.voxelite.init.ModItems;
import com.tricoeverfire.voxelite.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name, ToolMaterial material, float damage, float speed) {
		
		super(material, damage, speed);
        //this.attackDamage = damage;
        //this.attackSpeed = speed;
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
