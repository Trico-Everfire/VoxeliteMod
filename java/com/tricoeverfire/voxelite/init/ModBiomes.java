package com.tricoeverfire.voxelite.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes {
	
	public static final Biome VOXELITE_BIOME = new BiomeVoxelite();

	public static void registerBiomes() {
		
		modBiome(VOXELITE_BIOME, "voxelite_biome", BiomeType.DESERT,Type.MAGICAL,Type.RIVER,Type.PLAINS );
		
	}
	
	private static Biome modBiome(Biome biome, String name, BiomeType biomeType, Type... type) {
		
		
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, type);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome,10));
		
		return biome;
		
	}
	
}
