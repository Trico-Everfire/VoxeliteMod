package com.tricoeverfire.voxelite.liquids;

import java.util.Random;

import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class voxelite extends LiquidBase {

	public voxelite(String fluidName, ResourceLocation still, ResourceLocation flowing) {
		super(fluidName, still, flowing);
		setViscosity(1600);
		setLuminosity(15);
		setDensity(1);
	
		
	}
	

	 

}
