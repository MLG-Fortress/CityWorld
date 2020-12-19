package me.daddychurchill.CityWorld_00face.Context.Maze;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.Nature.CampgroundLot;
import me.daddychurchill.CityWorld_00face.Plats.Nature.WoodframeLot;
import me.daddychurchill.CityWorld_00face.Plats.Nature.WoodworksLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeWoodworksContext extends MazeConstructContext {

	public MazeWoodworksContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PlatLot generateSpecialOneLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new WoodframeLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateNormalLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		if (odds.playOdds(Odds.oddsUnlikely))
			return new CampgroundLot(platmap, chunkX, chunkZ);
		else
			return new WoodworksLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot generateSpecialTooLot(PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		return new CampgroundLot(platmap, chunkX, chunkZ);
	}

}
