package me.daddychurchill.CityWorld_00face.Context.SandDunes;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.HighriseContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.SandDunes.SandDunesOfficeBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.SandDunes.SandDunesParkLot;
import me.daddychurchill.CityWorld_00face.Plats.SandDunes.SandDunesUnfinishedBuildingLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class SandDunesHighriseContext extends HighriseContext {

	public SandDunesHighriseContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot getPark(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ,
			int waterDepth) {
		return new SandDunesParkLot(platmap, chunkX, chunkZ, generator.connectedKeyForParks, waterDepth);
	}

	@Override
	protected PlatLot getUnfinishedBuilding(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX,
			int chunkZ) {
		return new SandDunesUnfinishedBuildingLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot getBuilding(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new SandDunesOfficeBuildingLot(platmap, chunkX, chunkZ);
	}
}
