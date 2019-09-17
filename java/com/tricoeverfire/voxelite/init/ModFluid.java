package com.tricoeverfire.voxelite.init;

import com.tricoeverfire.voxelite.liquids.voxelite;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluid {

	
	public static final Fluid LIQUID_VOXELITE = new voxelite("liquid_voxelite", new ResourceLocation("voxelitemod:blocks/liquid_voxelite_still"), new ResourceLocation("voxelitemod:blocks/liquid_voxelite_flow"));
	
	
	public static void registerFluid() {
		registerFluid(LIQUID_VOXELITE);
	}
	public static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
	
	
}
