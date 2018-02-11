package com.ajaxvm.dimensional_anchors.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import com.ajaxvm.dimensional_anchors.DimensionalAnchorsMod;

public class ClientProxy extends CommonProxy {
	public ClientProxy () {
		this.ident = "client";
	}

	@Override
	public void registerItemRenderer(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().toString()));
	}

	@Override
	public void registerItemRenderer(Item item, int meta, String variant) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().toString(), variant));
	}
}