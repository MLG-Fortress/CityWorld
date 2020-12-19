package me.daddychurchill.CityWorld_00face.Plats.SnowDunes;

import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Rural.HouseLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class SnowDunesHouseLot extends HouseLot {

	public SnowDunesHouseLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new SnowDunesHouseLot(platmap, chunkX, chunkZ);
	}
}
