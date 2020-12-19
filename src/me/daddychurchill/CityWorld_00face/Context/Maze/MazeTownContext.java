package me.daddychurchill.CityWorld_00face.Context.Maze;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.ConcreteLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.LibraryBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.OfficeBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.ParkLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.StoreBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.UnfinishedBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.WarehouseBuildingLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeTownContext extends MazeConstructContext {

	public MazeTownContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	private final int connectParkMagicValue = 21436587;

	@Override
	protected PlatLot generateSpecialOneLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new ParkLot(platmap, chunkX, chunkZ, connectParkMagicValue, ParkLot.getWaterDepth(odds));
	}

	@Override
	protected PlatLot generateNormalLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		switch (odds.getRandomInt(5)) {
		case 0:
			return new LibraryBuildingLot(platmap, chunkX, chunkZ);
		case 1:
			return new StoreBuildingLot(platmap, chunkX, chunkZ);
		case 2:
			return new WarehouseBuildingLot(platmap, chunkX, chunkZ);
		case 3:
			return new OfficeBuildingLot(platmap, chunkX, chunkZ);
		case 4:
			return new ConcreteLot(platmap, chunkX, chunkZ);
		default:
			return new UnfinishedBuildingLot(platmap, chunkX, chunkZ);
		}
	}
}
