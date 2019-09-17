package com.tricoeverfire.voxelite.items.tools;

import javax.annotation.Nullable;

import com.tricoeverfire.voxelite.Main;
import com.tricoeverfire.voxelite.init.ModItems;
import com.tricoeverfire.voxelite.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolBow extends ItemBow implements IHasModel{

	public ToolBow(String name) {
		
	//	super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.voxelitemod);
		setMaxDamage(1200);
		setMaxStackSize(1);
		
		
		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
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
		return entityIn.getActiveItemStack().getItem() != ModItems.IRON_BOW ? 0.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F;
		}
		}
		});
		
		
		this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter()
		{
		@SideOnly(Side.CLIENT)
		public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
		{
		return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
		}
		});
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
	
}
