package me.daddychurchill.CityWorld_00face.Plats.Astral;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class AstralBlackTowerLot extends AstralStructureTowerLot {

	public AstralBlackTowerLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);

	}

	@Override
	protected void generateActualBlocks(CityWorldGenerator generator, PlatMap platmap, RealBlocks chunk,
			DataContext context, int platX, int platZ) {

		generateTower(generator, chunk, TowerStyle.DARK);
	}

}
