package com.tricoeverfire.voxelite.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBucket;

public class ItemEmeraldBucket extends ItemBucket{

	public ItemEmeraldBucket(String name, Block containedBlockIn) {
		super(containedBlockIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	
		
	}

}
