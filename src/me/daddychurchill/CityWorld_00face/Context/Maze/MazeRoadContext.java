package me.daddychurchill.CityWorld_00face.Context.Maze;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.RoadContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeRoadContext extends RoadContext {

	public MazeRoadContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void populateMap(CityWorldGenerator generator, PlatMap platmap) {
		// nothing to do
	}

	@Override
	public PlatLot createRoadLot(CityWorldGenerator generator, PlatMap platmap, int x, int z, boolean roundaboutPart,
			PlatLot oldLot) {
		return null;
	}

	@Override
	public PlatLot createRoundaboutStatueLot(CityWorldGenerator generator, PlatMap platmap, int x, int z) {
		return null;
	}
}
