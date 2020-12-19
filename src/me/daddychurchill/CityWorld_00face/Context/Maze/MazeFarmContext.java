package me.daddychurchill.CityWorld_00face.Context.Maze;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Rural.BarnLot;
import me.daddychurchill.CityWorld_00face.Plats.Rural.FarmLot;
import me.daddychurchill.CityWorld_00face.Plats.Rural.HouseLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeFarmContext extends MazeConstructContext {

	public MazeFarmContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot generateSpecialOneLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new HouseLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateNormalLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new FarmLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateSpecialTooLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new BarnLot(platmap, chunkX, chunkZ);
	}

}
