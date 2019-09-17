package com.tricoeverfire.voxelite.items.tools;

import javax.annotation.Nullable;

import com.tricoeverfire.voxelite.Main;
import com.tricoeverfire.voxelite.init.ModItems;
import com.tricoeverfire.voxelite.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolFishingRod extends ItemFishingRod implements IHasModel{

	public ToolFishingRod(String name) {
		
		//super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.voxelitemod);
		
		addPropertyOverride(new ResourceLocation("cast"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                if (entityIn == null)
                {
                    return 0.0F;
                }
                else
                {
                    boolean flag = entityIn.getHeldItemMainhand() == stack;
                    boolean flag1 = entityIn.getHeldItemOffhand() == stack;

                    if (entityIn.getHeldItemMainhand().getItem() instanceof ItemFishingRod)
                    {
                        flag1 = false;
                    }

                    return (flag || flag1) && entityIn instanceof EntityPlayer && ((EntityPlayer)entityIn).fishEntity != null ? 1.0F : 0.0F;
                }
            }
        });
		
		ModItems.ITEMS.add(this);

	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
	
}
