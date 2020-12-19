package me.daddychurchill.CityWorld_00face.Plats.Flooded;

import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.ParkLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class FloodedParkLot extends ParkLot {

	public FloodedParkLot(PlatMap platmap, int chunkX, int chunkZ, long globalconnectionkey, int waterDepth) {
		super(platmap, chunkX, chunkZ, globalconnectionkey, waterDepth);

	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new FloodedParkLot(platmap, chunkX, chunkZ, connectedkey, waterDepth);
	}

}
