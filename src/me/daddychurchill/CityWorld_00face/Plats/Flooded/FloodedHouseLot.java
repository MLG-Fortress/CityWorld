package me.daddychurchill.CityWorld_00face.Plats.Flooded;

import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Rural.HouseLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class FloodedHouseLot extends HouseLot {

	public FloodedHouseLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);

	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new FloodedHouseLot(platmap, chunkX, chunkZ);
	}
}
