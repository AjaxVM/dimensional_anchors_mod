package com.ajaxvm.dimensional_anchors.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.ajaxvm.dimensional_anchors.DimensionalAnchorsMod;
import com.ajaxvm.dimensional_anchors.utils.NameableThing;

public class ItemBase extends Item {

	public NameableThing name;

	public ItemBase(String name) {
		this.name = new NameableThing(name);
		setUnlocalizedName(this.name.absName);
		setRegistryName(DimensionalAnchorsMod.MODID, this.name.baseName);

		this.setCreativeTab(CreativeTabs.MATERIALS);
	}

	@Override
	public String getItemStackDisplayName (ItemStack stack) {
		if (DimensionalAnchorsMod.proxy.isIdent("server")) {
			return super.getItemStackDisplayName(stack);
		}

		return this.name.displayName;
	}

	public void registerItemModel() {
		DimensionalAnchorsMod.proxy.registerItemRenderer(this, 0, name.baseName);
	}
}