package me.daddychurchill.CityWorld_00face.Context.SandDunes;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.NatureContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.SandDunes.SandDunesNatureLot;
import me.daddychurchill.CityWorld_00face.Support.AbstractYs.HeightState;
import me.daddychurchill.CityWorld_00face.Support.HeightInfo;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class SandDunesNatureContext extends NatureContext {

	public SandDunesNatureContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PlatLot createNaturalLot(CityWorldGenerator generator, PlatMap platmap, int x, int z) {
		return new SandDunesNatureLot(platmap, platmap.originX + x, platmap.originZ + z);
	}

	@Override
	public PlatLot createSurfaceBuildingLot(CityWorldGenerator generator, PlatMap platmap, int x, int z,
			HeightInfo heights) {
		if (heights.getAverageHeight() > generator.shapeProvider.findHighestFloodY(generator))
			return super.createSurfaceBuildingLot(generator, platmap, x, z, heights);
		return null;
	}

	@Override
	protected void populateSpecial(CityWorldGenerator generator, PlatMap platmap, int x, int y, int z,
			HeightState state) {
		if (y > generator.shapeProvider.findHighestFloodY(generator))
			super.populateSpecial(generator, platmap, x, y, z, state);
	}

}
