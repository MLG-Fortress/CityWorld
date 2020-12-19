package me.daddychurchill.CityWorld_00face.Plats.SandDunes;

import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Rural.HouseLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class SandDunesHouseLot extends HouseLot {

	public SandDunesHouseLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new SandDunesHouseLot(platmap, chunkX, chunkZ);
	}
}
