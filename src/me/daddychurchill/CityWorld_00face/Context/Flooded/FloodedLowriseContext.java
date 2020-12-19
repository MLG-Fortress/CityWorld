package me.daddychurchill.CityWorld_00face.Context.Flooded;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.LowriseContext;
import me.daddychurchill.CityWorld_00face.Plats.Flooded.FloodedOfficeBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.Flooded.FloodedParkLot;
import me.daddychurchill.CityWorld_00face.Plats.Flooded.FloodedUnfinishedBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class FloodedLowriseContext extends LowriseContext {

	public FloodedLowriseContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot getPark(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ,
			int waterDepth) {
		return new FloodedParkLot(platmap, chunkX, chunkZ, generator.connectedKeyForParks, waterDepth);
	}

	@Override
	protected PlatLot getUnfinishedBuilding(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX,
			int chunkZ) {
		return new FloodedUnfinishedBuildingLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot getBuilding(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new FloodedOfficeBuildingLot(platmap, chunkX, chunkZ);
	}
}
