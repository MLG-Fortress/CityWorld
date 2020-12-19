package me.daddychurchill.CityWorld_00face.Plats.Flooded;

import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.RoadLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class FloodedRoadLot extends RoadLot {

	private FloodedRoadLot(PlatMap platmap, int chunkX, int chunkZ, long globalconnectionkey, boolean roundaboutPart) {
		super(platmap, chunkX, chunkZ, globalconnectionkey, roundaboutPart);

	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new FloodedRoadLot(platmap, chunkX, chunkZ, connectedkey, roundaboutRoad);
	}

}
