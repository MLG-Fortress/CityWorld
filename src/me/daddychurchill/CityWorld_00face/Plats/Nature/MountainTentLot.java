package me.daddychurchill.CityWorld_00face.Plats.Nature;

import org.bukkit.generator.ChunkGenerator.BiomeGrid;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.InitialBlocks;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class MountainTentLot extends MountainFlatLot {

	public MountainTentLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);

	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new MountainTentLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected void generateActualChunk(CityWorldGenerator generator, PlatMap platmap, InitialBlocks chunk,
			BiomeGrid biomes, DataContext context, int platX, int platZ) {
		generateSmoothedLot(generator, chunk, context);
	}

	@Override
	protected void generateActualBlocks(CityWorldGenerator generator, PlatMap platmap, RealBlocks chunk,
			DataContext context, int platX, int platZ) {
		generator.reportLocation("Campground", chunk);

		// place snow
		generateSurface(generator, chunk, false);

		// now make a tent
		generator.structureOnGroundProvider.generateCampground(generator, chunk, context, chunkOdds,
				blockYs.getAverageHeight() + 1);
	}

}
