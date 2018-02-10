package com.ajaxvm.dimensional_anchors.blocks;

import net.minecraft.block.material.Material;

public class OreBase extends BlockBase {

	public OreBase(String name) {
		super(Material.ROCK, name);
	
		setHardness(3f);
		setResistance(5f);
	}

}