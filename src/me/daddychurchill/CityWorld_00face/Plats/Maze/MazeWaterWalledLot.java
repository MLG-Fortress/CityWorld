package me.daddychurchill.CityWorld_00face.Plats.Maze;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeWaterWalledLot extends MazeLavaWalledLot {

	public MazeWaterWalledLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Material getWallMaterial(CityWorldGenerator generator) {
		return Material.WATER;
	}

}
