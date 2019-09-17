package com.tricoeverfire.voxelite.blocks;

import java.util.Random;

import com.tricoeverfire.voxelite.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AvokinateOre extends BlockBase{

	public AvokinateOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(15.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe",2);
		setLightLevel(12.0F);
		
	
	}
	
@Override
public Block setHardness(float hardness) {
	
	return super.setHardness(hardness);
}

@Override
public boolean addDestroyEffects(World world, BlockPos pos, ParticleManager manager) {
	// TODO Auto-generated method stub
	return super.addDestroyEffects(world, pos, manager);

}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return ModItems.AVOKINATE_CRYSTAL;
	}
	
	@Override
	 protected boolean canSilkHarvest()
	{
	    return true;
	}

}
