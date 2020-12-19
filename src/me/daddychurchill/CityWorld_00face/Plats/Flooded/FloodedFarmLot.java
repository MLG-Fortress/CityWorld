package me.daddychurchill.CityWorld_00face.Plats.Flooded;

import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Rural.FarmLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class FloodedFarmLot extends FarmLot {

	public FloodedFarmLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);

	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new FloodedFarmLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected CropType setNormalCrop() {
		return CropType.FALLOW;
	}

	@Override
	protected CropType setDecayedNormalCrop() {
		return CropType.FALLOW;
	}

	@Override
	protected CropType setNetherCrop() {
		return CropType.FALLOW;
	}

	@Override
	protected CropType setDecayedNetherCrop() {
		return CropType.FALLOW;
	}
}
