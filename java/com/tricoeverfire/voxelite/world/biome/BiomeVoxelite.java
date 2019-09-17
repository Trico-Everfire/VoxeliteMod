package com.tricoeverfire.voxelite.world.biome;

import com.tricoeverfire.voxelite.init.ModBlocks;

import net.minecraft.world.biome.Biome;

public class BiomeVoxelite extends Biome {

	public BiomeVoxelite() {
		super(new BiomeProperties("Voxelite").setBaseHeight(0.0F).setHeightVariation(0.2F).setTemperature(-1.0F).setRainDisabled().setWaterColor(16777215));
		
		//TopBlock = ModBlocks.BLEACHED_BLOCK.getDefaultState().withProperty(, );
		
		
	}

}
