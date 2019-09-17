package com.tricoeverfire.voxelite.util.handlers;

import com.tricoeverfire.voxelite.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderHandler {

	
	@SideOnly(Side.CLIENT)
	public static void registerCustomMeshesAndStates() {
		
		
		
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(ModBlocks.LIQUID_VOXELITE), new ItemMeshDefinition(){
			
			
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation("voxelitemod:liquid_voxelite","fluid");
			}
			
		});
	
	ModelLoader.setCustomStateMapper(ModBlocks.LIQUID_VOXELITE, new StateMapperBase() {
		
		@Override
		protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
			return new ModelResourceLocation("voxelitemod:liquid_voxelite","fluid");
		}
		
	});
		
	}
}