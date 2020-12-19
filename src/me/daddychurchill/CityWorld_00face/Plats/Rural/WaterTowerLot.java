package me.daddychurchill.CityWorld_00face.Plats.Rural;

import org.bukkit.generator.ChunkGenerator.BiomeGrid;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Plats.IsolatedLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.AbstractCachedYs;
import me.daddychurchill.CityWorld_00face.Support.InitialBlocks;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class WaterTowerLot extends IsolatedLot {

	public WaterTowerLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		// TODO Auto-generated constructor stub

	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new WaterTowerLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected void generateActualChunk(CityWorldGenerator generator, PlatMap platmap, InitialBlocks chunk,
			BiomeGrid biomes, DataContext context, int platX, int platZ) {

	}

	@Override
	protected void generateActualBlocks(CityWorldGenerator generator, PlatMap platmap, RealBlocks chunk,
			DataContext context, int platX, int platZ) {

		// if things are bad
		if (generator.getSettings().includeDecayedBuildings) {
			destroyLot(generator, generator.streetLevel - 2, generator.streetLevel + 2);
		} else {
			generator.structureOnGroundProvider.drawWaterTower(generator, chunk, 4, generator.streetLevel + 1, 4,
					chunkOdds);
			generateSurface(generator, chunk, false);
		}
	}

	@Override
	public int getBottomY(CityWorldGenerator generator) {
		return generator.streetLevel;
	}

	@Override
	public int getTopY(CityWorldGenerator generator, AbstractCachedYs blockYs, int x, int z) {
		return generator.streetLevel + 15;
	}
}
