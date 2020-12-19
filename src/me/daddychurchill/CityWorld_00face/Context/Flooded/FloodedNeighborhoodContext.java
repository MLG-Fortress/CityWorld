package me.daddychurchill.CityWorld_00face.Context.Flooded;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.NeighborhoodContext;
import me.daddychurchill.CityWorld_00face.Plats.Flooded.FloodedHouseLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class FloodedNeighborhoodContext extends NeighborhoodContext {

	public FloodedNeighborhoodContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot getHouseLot(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new FloodedHouseLot(platmap, chunkX, chunkZ);
	}
}
