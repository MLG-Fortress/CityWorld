package me.daddychurchill.CityWorld_00face.Plats.Nature;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class GravelMineLot extends GravelLot {

	public GravelMineLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);

		trulyIsolated = true;
	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new GravelMineLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected void generateActualBlocks(CityWorldGenerator generator, PlatMap platmap, RealBlocks chunk,
			DataContext context, int platX, int platZ) {
		generateHole(generator, chunkOdds, chunk, generator.streetLevel, 14, 16);

		// place snow
		generateSurface(generator, chunk, false);

	}
}
