package com.tricoeverfire.voxelite.items.tools;

import com.tricoeverfire.voxelite.Main;

import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;

public class IronBow extends ToolBow{

	public IronBow(String name) {
		super(name);

	}

	@Override
	 protected boolean isArrow(ItemStack stack)
    {
        return stack.getItem() instanceof ItemArrow;
    }
	
	
}
