package me.daddychurchill.CityWorld_00face.Plats.Astral;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class AstralNatureLot extends AstralLot {

	public AstralNatureLot(PlatMap platmap, int chunkX, int chunkZ, double populationChance) {
		super(platmap, chunkX, chunkZ, populationChance);

		style = LotStyle.NATURE;
	}

	private static final double oddsOfBuriedSaucer = Odds.oddsEnormouslyUnlikely;

	@Override
	protected void generateActualBlocks(CityWorldGenerator generator, PlatMap platmap, RealBlocks chunk,
			DataContext context, int platX, int platZ) {

		if (blockYs.getAverageHeight() > 40 && chunkOdds.playOdds(oddsOfBuriedSaucer)) {
			int y = chunkOdds.calcRandomRange(20, blockYs.getAverageHeight() - 10);
			AstralStructureSaucerLot.drawSaucer(generator, chunk, y);
		}
	}

}
