package com.tricoeverfire.voxelite.blocks;

import java.util.Random;

import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BleachedBlock extends BlockBase {

	public BleachedBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.GLASS);
		setHardness(6.0F);
		setResistance(12.0F);
		setHarvestLevel("pickaxe",2);
		setLightLevel(12.0F);
		
	}
	
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote)
        {
            if (!worldIn.isAreaLoaded(pos, 2)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2)
            {
                worldIn.setBlockState(pos, Blocks.GRASS.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
            }
            else
            {
                if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
                {
                    for (int i = 0; i < 4; ++i)
                    {
                        BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
                        IBlockState iblockstate = worldIn.getBlockState(blockpos);
                        IBlockState iblockstate1 = worldIn.getBlockState(blockpos.up());

                        if (iblockstate.getBlock() == Blocks.GRASS && iblockstate.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate1.getLightOpacity(worldIn, blockpos.up()) <= 2)
                        {
                            worldIn.setBlockState(blockpos, this.getDefaultState());
                        }
                    }
                }
            }
        }
	}
	
}
