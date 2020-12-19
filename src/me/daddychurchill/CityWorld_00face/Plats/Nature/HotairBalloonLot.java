package me.daddychurchill.CityWorld_00face.Plats.Nature;

import org.bukkit.generator.ChunkGenerator.BiomeGrid;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Plats.ConstructLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plugins.StructureInAirProvider;
import me.daddychurchill.CityWorld_00face.Support.InitialBlocks;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class HotairBalloonLot extends ConstructLot {

	public HotairBalloonLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		trulyIsolated = true;
	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new HotairBalloonLot(platmap, chunkX, chunkZ);
	}

	@Override
	public int getBottomY(CityWorldGenerator generator) {
		return blockYs.getMaxHeight() + 20;
	}

	@Override
	protected void generateActualChunk(CityWorldGenerator generator, PlatMap platmap, InitialBlocks chunk,
			BiomeGrid biomes, DataContext context, int platX, int platZ) {
		// TODO what?
	}

	@Override
	protected void generateActualBlocks(CityWorldGenerator generator, PlatMap platmap, RealBlocks chunk,
			DataContext context, int platX, int platZ) {

		// place snow
		generateSurface(generator, chunk, false);

		// where is the surface?
		int atY = getBottomY(generator);

		// hot air balloon
		generator.reportLocation("Hot Air Balloon", chunk);
		int rangeY = Math.max(2, chunk.height - StructureInAirProvider.hotairBalloonHeight - atY);
		generator.structureInAirProvider.generateHotairBalloon(generator, chunk, context,
				atY + chunkOdds.getRandomInt(rangeY), chunkOdds);
	}
}
