package me.daddychurchill.CityWorld_00face.Context.SandDunes;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.FarmContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.SandDunes.SandDunesFarmLot;
import me.daddychurchill.CityWorld_00face.Plats.SandDunes.SandDunesHouseLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class SandDunesFarmContext extends FarmContext {

	public SandDunesFarmContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot getFarmLot(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new SandDunesFarmLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot getHouseLot(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new SandDunesHouseLot(platmap, chunkX, chunkZ);
	}
}
