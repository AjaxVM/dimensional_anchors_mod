package com.ajaxvm.dimensional_anchors.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import com.ajaxvm.dimensional_anchors.DimensionalAnchorsMod;
import com.ajaxvm.dimensional_anchors.utils.NameableThing;

public class BlockBase extends Block {

	public NameableThing name;

	public BlockBase(Material material, String name) {
		super(material);
	
		this.name = new NameableThing(name);
	
		setUnlocalizedName(this.name.absName);
		setRegistryName(DimensionalAnchorsMod.MODID, this.name.baseName);

		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	public void registerItemModel(Item itemBlock) {
		// todo: does this need to be more flexible?
		// // always load normal and "inventory" variants...
		// DimensionalAnchorsMod.proxy.registerItemRenderer(itemBlock, 0, "normal");
		DimensionalAnchorsMod.proxy.registerItemRenderer(itemBlock, 0, "inventory");
	}
	
	public Item createItemBlock() {
		return new ItemBlockBase(this);
		// return new ItemBlock(this).setRegistryName(getRegistryName());
	}

}