package me.daddychurchill.CityWorld_00face.Context.Maze;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.Nature.GravelMineLot;
import me.daddychurchill.CityWorld_00face.Plats.Nature.GravelworksLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeMineContext extends MazeConstructContext {

	public MazeMineContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot generateSpecialOneLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new GravelMineLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateNormalLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new GravelworksLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateSpecialTooLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new GravelworksLot(platmap, chunkX, chunkZ);
	}

}
