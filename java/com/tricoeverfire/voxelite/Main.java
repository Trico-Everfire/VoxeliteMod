package com.tricoeverfire.voxelite;

import com.tricoeverfire.voxelite.init.ModFluid;
import com.tricoeverfire.voxelite.init.ModRecipes;
import com.tricoeverfire.voxelite.init.ModTabs;
import com.tricoeverfire.voxelite.proxy.ClientProxy;
import com.tricoeverfire.voxelite.proxy.CommonProxy;
import com.tricoeverfire.voxelite.util.Reference;
import com.tricoeverfire.voxelite.util.handlers.RegistryHandler;
import com.tricoeverfire.voxelite.util.handlers.RenderHandler;
import com.tricoeverfire.voxelite.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	public static final CreativeTabs voxelitemod = new ModTabs("voxelitemod");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		ModFluid.registerFluid();
		
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		
		
	}
	
	
	
	@EventHandler

	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}
	
	@EventHandler
	@SideOnly(Side.CLIENT)
	public static void Postinit(FMLPostInitializationEvent event) {
		
	}
}
