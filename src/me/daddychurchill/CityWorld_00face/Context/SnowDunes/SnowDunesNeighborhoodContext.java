package me.daddychurchill.CityWorld_00face.Context.SnowDunes;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.NeighborhoodContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.SnowDunes.SnowDunesHouseLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class SnowDunesNeighborhoodContext extends NeighborhoodContext {

	public SnowDunesNeighborhoodContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot getHouseLot(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new SnowDunesHouseLot(platmap, chunkX, chunkZ);
	}
}
