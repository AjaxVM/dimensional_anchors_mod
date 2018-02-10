package com.ajaxvm.dimensional_anchors.proxy;

import net.minecraft.item.Item;
import com.ajaxvm.dimensional_anchors.utils.NameableThing;

public class CommonProxy {
	protected String ident;
	public CommonProxy () {
		this.ident = "server";
	}

	public boolean isIdent (String i) {
		return this.ident == i;
	}

	public void registerItemRenderer(Item item, int meta, String id) {
	}
}