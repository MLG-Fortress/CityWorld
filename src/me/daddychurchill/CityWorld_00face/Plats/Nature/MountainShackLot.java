package me.daddychurchill.CityWorld_00face.Plats.Nature;

import org.bukkit.generator.ChunkGenerator.BiomeGrid;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.InitialBlocks;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class MountainShackLot extends MountainFlatLot {

	public MountainShackLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);

	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new MountainShackLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected void generateActualChunk(CityWorldGenerator generator, PlatMap platmap, InitialBlocks chunk,
			BiomeGrid biomes, DataContext context, int platX, int platZ) {

		// empty it out and add the retainer wall, as needed
		generateRetainerLot(generator, chunk, context);
	}

	@Override
	protected void generateActualBlocks(CityWorldGenerator generator, PlatMap platmap, RealBlocks chunk,
			DataContext context, int platX, int platZ) {
		generator.reportLocation("Shack", chunk);

		// now make a shack
		int atY = blockYs.getAverageHeight() + 1;
		int floors = generator.structureOnGroundProvider.generateRuralShack(generator, chunk, context, chunkOdds, atY,
				5);

		// not a happy place?
		if (generator.getSettings().includeDecayedBuildings)
			destroyBuilding(generator, atY, floors);
		else
			generateSurface(generator, chunk, false);
		generator.spawnProvider.spawnBeing(generator, chunk, chunkOdds, 5, atY, 5);
	}
}