package com.ajaxvm.dimensional_anchors.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static BlockBase[] entries = {
		new OreBase("ore_copper"),
		new CustomBlockBase("dimensional_anchor")
	};

	public static void register(IForgeRegistry<Block> registry) {
		for (BlockBase entry : entries) {
			// TODO: can this take an array?
			registry.registerAll(entry);
		}
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		for (BlockBase entry : entries) {
			// TODO: can this take an array?
			registry.registerAll(entry.createItemBlock());
		}
	}
	
	public static void registerModels() {
		for (BlockBase entry : entries) {
			entry.registerItemModel(Item.getItemFromBlock(entry));
		}
	}

}