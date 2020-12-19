package me.daddychurchill.CityWorld_00face.Context.Floating;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.RoadContext;
import me.daddychurchill.CityWorld_00face.Plats.Floating.FloatingRoadLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class FloatingRoadContext extends RoadContext {

	public FloatingRoadContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PlatLot createRoadLot(CityWorldGenerator generator, PlatMap platmap, int x, int z, boolean roundaboutPart,
			PlatLot oldLot) {
		return new FloatingRoadLot(platmap, platmap.originX + x, platmap.originZ + z,
				generator.connectedKeyForPavedRoads, roundaboutPart);
	}

}
