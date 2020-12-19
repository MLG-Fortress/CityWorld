package me.daddychurchill.CityWorld_00face.Plats;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Support.AbstractCachedYs;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public abstract class ConstructLot extends IsolatedLot {

	protected ConstructLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
	}

	@Override
	public boolean isPlaceableAt(CityWorldGenerator generator, int chunkX, int chunkZ) {
		return generator.getSettings().inConstructRange(chunkX, chunkZ);
	}

	@Override
	public PlatLot validateLot(PlatMap platmap, int platX, int platZ) {
		return null;
	}

	@Override
	public int getBottomY(CityWorldGenerator generator) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTopY(CityWorldGenerator generator, AbstractCachedYs blockYs, int x, int z) {
		return blockYs.getBlockY(x, z);
//		return generator.streetLevel;
	}
}
