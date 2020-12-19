package me.daddychurchill.CityWorld_00face.Plats.Astral;

import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

abstract class AstralStructureLot extends AstralLot {

	AstralStructureLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ, Odds.oddsAlwaysGoingToHappen);

		this.style = LotStyle.STRUCTURE;
	}

}
