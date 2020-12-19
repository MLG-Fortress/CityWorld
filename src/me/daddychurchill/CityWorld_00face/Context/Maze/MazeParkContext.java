package me.daddychurchill.CityWorld_00face.Context.Maze;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Rural.WaterTowerLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.ParkLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.RoundaboutCenterLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeParkContext extends MazeConstructContext {

	public MazeParkContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	private final int connectParkMagicValue = 18273645;

	@Override
	protected PlatLot generateSpecialOneLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new RoundaboutCenterLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateNormalLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new ParkLot(platmap, chunkX, chunkZ, connectParkMagicValue, DataContext.FloorHeight);
	}

	@Override
	protected PlatLot generateSpecialTooLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new WaterTowerLot(platmap, chunkX, chunkZ);
	}
}
