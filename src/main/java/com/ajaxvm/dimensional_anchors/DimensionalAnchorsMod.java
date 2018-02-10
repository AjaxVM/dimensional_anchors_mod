package com.ajaxvm.dimensional_anchors;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import com.ajaxvm.dimensional_anchors.proxy.CommonProxy;
import com.ajaxvm.dimensional_anchors.items.ModItems;
import com.ajaxvm.dimensional_anchors.blocks.ModBlocks;

@Mod(modid = DimensionalAnchorsMod.MODID, name = DimensionalAnchorsMod.NAME, version = DimensionalAnchorsMod.VERSION)
public class DimensionalAnchorsMod {
    public static final String MODID = "dimensional_anchors";
    public static final String NAME = "Dimensional Anchors";
    public static final String VERSION = "0.1";

    @SidedProxy(
    	serverSide = "com.ajaxvm.dimensional_anchors.proxy.CommonProxy",
    	clientSide = "com.ajaxvm.dimensional_anchors.proxy.ClientProxy"
    )
	public static CommonProxy proxy;

    @Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
	}
}
