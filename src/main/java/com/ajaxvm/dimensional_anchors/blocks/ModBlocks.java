package com.ajaxvm.dimensional_anchors.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static OreBase oreCopper = new OreBase("ore_copper");

	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				oreCopper
		);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				oreCopper.createItemBlock()
		);
	}
	
	public static void registerModels() {
		oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
	}

}