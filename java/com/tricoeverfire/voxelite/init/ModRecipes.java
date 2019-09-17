package com.tricoeverfire.voxelite.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.AVOKINATE_ORE, new ItemStack(ModItems.AVOKINATE_CRYSTAL,1), 5.2F);
		
	}
	
}
