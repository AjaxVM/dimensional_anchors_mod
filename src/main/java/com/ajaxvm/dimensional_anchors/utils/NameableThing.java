package com.ajaxvm.dimensional_anchors.utils;

import com.ajaxvm.dimensional_anchors.DimensionalAnchorsMod;

public class NameableThing {
	public String baseName;
	public String absName;
	public String displayName;

	public NameableThing (String name) {
		this.baseName = name;
		this.absName = DimensionalAnchorsMod.MODID + ":" + this.baseName;

		// TODO: load this from config and fall back to this maybe?
		this.displayName = Common.capitalizeWords(this.baseName.replace("_", " "));
	}
}