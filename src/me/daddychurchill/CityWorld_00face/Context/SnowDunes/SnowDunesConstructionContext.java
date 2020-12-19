package me.daddychurchill.CityWorld_00face.Context.SnowDunes;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.ConstructionContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.SnowDunes.SnowDunesOfficeBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.SnowDunes.SnowDunesParkLot;
import me.daddychurchill.CityWorld_00face.Plats.SnowDunes.SnowDunesUnfinishedBuildingLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class SnowDunesConstructionContext extends ConstructionContext {

	public SnowDunesConstructionContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot getPark(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ,
			int waterDepth) {
		return new SnowDunesParkLot(platmap, chunkX, chunkZ, generator.connectedKeyForParks, waterDepth);
	}

	@Override
	protected PlatLot getUnfinishedBuilding(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX,
			int chunkZ) {
		return new SnowDunesUnfinishedBuildingLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot getBuilding(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new SnowDunesOfficeBuildingLot(platmap, chunkX, chunkZ);
	}
}
