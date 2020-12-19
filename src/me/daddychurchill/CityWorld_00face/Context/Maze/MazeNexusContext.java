package me.daddychurchill.CityWorld_00face.Context.Maze;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.Maze.MazeCoveredLot;
import me.daddychurchill.CityWorld_00face.Plats.Maze.MazeInvisibleWalledLot;
import me.daddychurchill.CityWorld_00face.Plats.Maze.MazeLavaWalledLot;
import me.daddychurchill.CityWorld_00face.Plats.Maze.MazeWaterWalledLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeNexusContext extends MazeConstructContext {

	public MazeNexusContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot generateSpecialOneLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new MazeLavaWalledLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateSpecialTooLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new MazeWaterWalledLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateNormalLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		if (odds.flipCoin())
			return new MazeCoveredLot(platmap, chunkX, chunkZ);
		else
			return new MazeInvisibleWalledLot(platmap, chunkX, chunkZ);
	}

}
