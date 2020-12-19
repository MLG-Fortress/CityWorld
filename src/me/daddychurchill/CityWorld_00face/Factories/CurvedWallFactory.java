package me.daddychurchill.CityWorld_00face.Factories;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;

import me.daddychurchill.CityWorld_00face.Support.AbstractBlocks;
import me.daddychurchill.CityWorld_00face.Support.Odds;

public class CurvedWallFactory extends MaterialFactory {

	public CurvedWallFactory(Odds odds, boolean decayed) {
		super(odds, decayed);
	}

	public CurvedWallFactory(MaterialFactory other) {
		super(other);
	}

	@Override
	public void placeMaterial(AbstractBlocks blocks, Material primary, Material secondary, int x, int y1, int y2, int z,
			BlockFace... facing) {
		super.placeMaterial(blocks, primary, secondary, pickMaterial(primary, secondary, x * z), x, y1, y2, z, facing);
	}
}
