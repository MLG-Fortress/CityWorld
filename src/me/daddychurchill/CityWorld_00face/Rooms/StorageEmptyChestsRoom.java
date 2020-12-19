package me.daddychurchill.CityWorld_00face.Rooms;

import org.bukkit.block.BlockFace;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plugins.LootProvider.LootLocation;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class StorageEmptyChestsRoom extends StorageFilledChestsRoom {

	public StorageEmptyChestsRoom() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void drawChest(CityWorldGenerator generator, RealBlocks chunk, Odds odds, BlockFace direction, int x,
			int y, int z) {
		chunk.setChest(generator, x, y, z, direction, odds, generator.lootProvider, LootLocation.EMPTY);
	}

}
