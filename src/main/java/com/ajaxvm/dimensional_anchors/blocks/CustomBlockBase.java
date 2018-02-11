package com.ajaxvm.dimensional_anchors.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class CustomBlockBase extends BlockBase {
	// Same as BlockBase, but handles non-opaque/custom blocks
	// use BlockBase/etc. for standard blocks

	public CustomBlockBase (String name) {
		super(Material.ROCK, name);
	}

	@Override
	@Deprecated // Deprecated is used, it appears, to indicate an internal method... wtf...
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}