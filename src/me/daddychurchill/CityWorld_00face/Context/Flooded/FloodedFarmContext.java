package me.daddychurchill.CityWorld_00face.Context.Flooded;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.FarmContext;
import me.daddychurchill.CityWorld_00face.Plats.Flooded.FloodedFarmLot;
import me.daddychurchill.CityWorld_00face.Plats.Flooded.FloodedHouseLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class FloodedFarmContext extends FarmContext {

	public FloodedFarmContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot getBackfillLot(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new FloodedFarmLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot getHouseLot(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new FloodedHouseLot(platmap, chunkX, chunkZ);
	}
}
