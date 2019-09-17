package com.tricoeverfire.voxelite.init;

import java.util.ArrayList;
import java.util.List;

import com.tricoeverfire.voxelite.blocks.AvokinateBlock;
import com.tricoeverfire.voxelite.blocks.AvokinateOre;
import com.tricoeverfire.voxelite.blocks.BleachedBlock;
import com.tricoeverfire.voxelite.blocks.BlockAlphaPlant;
import com.tricoeverfire.voxelite.blocks.BlockOmegaPlant;
import com.tricoeverfire.voxelite.blocks.CrackedReinforcedGlass;
import com.tricoeverfire.voxelite.blocks.LiquidVoxeliteBlock;
import com.tricoeverfire.voxelite.blocks.ReinforcedGlass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//blocks
	public static final Block BLEACHED_BLOCK = new BleachedBlock("bleached_block", Material.GLASS);
	public static final Block AVOKINATE_BLOCK = new AvokinateBlock("avokinate_block", Material.GLASS);
	//public static final Block VOXELIZED_STONE = new BlockBase("avokinate_block", Material.GLASS);
	public static final Block AVOKINATE_ORE = new AvokinateOre("avokinate_ore", Material.ROCK);
	public static final Block REINFORCED_GLASS = new ReinforcedGlass("reinforced_glass", Material.GLASS);
	public static final Block CRACKED_REINFORCED_GLASS = new CrackedReinforcedGlass("cracked_reinforced_glass",Material.GLASS);

	//liquids
	public static final Block LIQUID_VOXELITE = new LiquidVoxeliteBlock("liquid_voxelite",ModFluid.LIQUID_VOXELITE,Material.WATER);

	public static final Block ALPHA_BERRY_PLANT = new BlockAlphaPlant("alpha_berry_plant");
	public static final Block OMEGA_BERRY_PLANT = new BlockOmegaPlant("omega_berry_plant");

}