package com.ajaxvm.dimensional_anchors.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import com.ajaxvm.dimensional_anchors.DimensionalAnchorsMod;
import com.ajaxvm.dimensional_anchors.utils.NameableThing;

public class ItemBlockBase extends ItemBlock {

	public NameableThing name;

	public ItemBlockBase(BlockBase b) {
		super(b);
	
		this.name = b.name;
	
		setUnlocalizedName(this.name.absName);
		setRegistryName(DimensionalAnchorsMod.MODID, this.name.baseName);
	}

	@Override
	public String getItemStackDisplayName (ItemStack stack) {
		if (DimensionalAnchorsMod.proxy.isIdent("server")) {
			return super.getItemStackDisplayName(stack);
		}

		return this.name.displayName;
	}

}