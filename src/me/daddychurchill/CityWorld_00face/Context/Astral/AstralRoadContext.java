package me.daddychurchill.CityWorld_00face.Context.Astral;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.RoadContext;
import me.daddychurchill.CityWorld_00face.Plats.Astral.AstralRoadLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class AstralRoadContext extends RoadContext {

	public AstralRoadContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PlatLot createRoadLot(CityWorldGenerator generator, PlatMap platmap, int x, int z, boolean roundaboutPart,
			PlatLot oldLot) {
		return new AstralRoadLot(platmap, platmap.originX + x, platmap.originZ + z, generator.connectedKeyForPavedRoads,
				roundaboutPart);
	}

}
