package com.tricoeverfire.voxelite.init;

import java.util.ArrayList;
import java.util.List;

import com.tricoeverfire.voxelite.items.ItemBase;
import com.tricoeverfire.voxelite.items.armor.ArmorBase;
import com.tricoeverfire.voxelite.items.food.FoodBerryAlpha;
import com.tricoeverfire.voxelite.items.food.FoodBerryOmega;
import com.tricoeverfire.voxelite.items.tools.AvokinatePickaxe;
import com.tricoeverfire.voxelite.items.tools.ToolAxe;
import com.tricoeverfire.voxelite.items.tools.ToolBow;
import com.tricoeverfire.voxelite.items.tools.ToolFishingRod;
import com.tricoeverfire.voxelite.items.tools.ToolHoe;
import com.tricoeverfire.voxelite.items.tools.ToolPickaxe;
import com.tricoeverfire.voxelite.items.tools.ToolShears;
import com.tricoeverfire.voxelite.items.tools.ToolSpade;
import com.tricoeverfire.voxelite.items.tools.ToolSword;
import com.tricoeverfire.voxelite.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	
	//materiels
	public static final ToolMaterial MATERIAL_AVOKINATE = EnumHelper.addToolMaterial("material_avokinate", 3, 2080, 6.0F, 4.5F, 11);
	public static final ToolMaterial CHARGED_MATERIAL_AVOKINATE = EnumHelper.addToolMaterial("material_avokinate", 4, 3160, 8.0F, 6.0F, 11);
	public static final ArmorMaterial ARMOR_MATERIAL_AVOKINATE = EnumHelper.addArmorMaterial("armor_material_avokinate", Reference.MOD_ID + ":avokinate", 14, new int[] {2,7,5,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F);
	public static final ToolMaterial MATERIAL_IRONREINFORCED = EnumHelper.addToolMaterial("material_ironreinforced", 3, 1250, 5.0F, 4.0F, 11);
	
	//items
	public static final Item EMERALD_BUCKET_EMPTY = new ItemBase("emerald_bucket_empty");
	public static final Item EMERALD_BUCKET_VOXELITE = new ItemBase("emerald_bucket_voxelite");
	public static final Item AVOKINATE_CRYSTAL = new ItemBase("avokinate_crystal");
	public static final Item CHARGED_AVOKINATE_CRYSTAL = new ItemBase("charged_avokinate_crystal");
	public static final Item AVOKINATE_DUST = new ItemBase("avokinate_dust");
	public static final Item IRON_STICK = new ItemBase("iron_stick");
	public static final Item AVOKINATE_MEDAL = new ItemBase("avokinate_medal");
	public static final Item VOXELIZED_SLUDGE = new ItemBase("voxelized_sludge");
	
	//tools
	public static final ItemPickaxe AVOKINATE_PICKAXE = new AvokinatePickaxe("avokinate_pickaxe", MATERIAL_AVOKINATE);
	public static final ItemPickaxe CHARGED_AVOKINATE_PICKAXE = new AvokinatePickaxe("charged_avokinate_pickaxe", CHARGED_MATERIAL_AVOKINATE);
	public static final ItemSword AVOKINATE_SWORD = new ToolSword("avokinate_sword",MATERIAL_AVOKINATE);
	public static final ItemSword CHARGED_AVOKINATE_SWORD = new ToolSword("charged_avokinate_sword",CHARGED_MATERIAL_AVOKINATE);
	public static final ItemSpade AVOKINATE_SPADE = new ToolSpade("avokinate_spade",MATERIAL_AVOKINATE);
	public static final ItemSpade CHARGED_AVOKINATE_SPADE = new ToolSpade("charged_avokinate_spade",CHARGED_MATERIAL_AVOKINATE);
	public static final ItemAxe AVOKINATE_AXE = new ToolAxe("avokinate_axe",MATERIAL_AVOKINATE, 6.0F,-3.2F);
	public static final ItemAxe CHARGED_AVOKINATE_AXE = new ToolAxe("charged_avokinate_axe",CHARGED_MATERIAL_AVOKINATE,8.0F,0.5F);
	public static final ItemHoe AVOKINATE_HOE = new ToolHoe("avokinate_hoe",MATERIAL_AVOKINATE);
	public static final ItemHoe CHARGED_AVOKINATE_HOE = new ToolHoe("charged_avokinate_hoe",CHARGED_MATERIAL_AVOKINATE);
	public static final ItemShears DIAMOND_SHEARS = new ToolShears("diamond_shears");
	public static final ItemBow IRON_BOW = new ToolBow("iron_bow");
	public static final ItemFishingRod IRON_FISHING_ROD = new ToolFishingRod("iron_fishing_rod");
	//public static final ItemArrow IRON_ARROW = new ToolArrow("iron_arrow");
	//public static final ItemArrow AVOKINATE_TIPPED_ARROW = new ToolArrow("avokinate_tipped_arrow");
	
	
	//armor
	public static final Item AVOKINATE_HELMET = new ArmorBase("avokinate_helmet",ARMOR_MATERIAL_AVOKINATE,1,EntityEquipmentSlot.HEAD);
	public static final Item AVOKINATE_CHESTPLATE = new ArmorBase("avokinate_chestplate",ARMOR_MATERIAL_AVOKINATE,1,EntityEquipmentSlot.CHEST);
	public static final Item AVOKINATE_LEGGINGS = new ArmorBase("avokinate_leggings",ARMOR_MATERIAL_AVOKINATE,2,EntityEquipmentSlot.LEGS);
	public static final Item AVOKINATE_BOOTS = new ArmorBase("avokinate_boots",ARMOR_MATERIAL_AVOKINATE,1,EntityEquipmentSlot.FEET);
	
	
	//food
	public static final ItemFood ALPHA_BERRY = new FoodBerryAlpha("alpha_berry", 2, false);
	public static final ItemFood OMEGA_BERRY = new FoodBerryOmega("omega_berry", 2, false);
}
