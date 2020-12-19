package me.daddychurchill.CityWorld_00face.Context.Maze;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Clipboard.PasteProvider.SchematicFamily;
import me.daddychurchill.CityWorld_00face.Context.NatureContext;
import me.daddychurchill.CityWorld_00face.Plats.Maze.MazeNatureLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class MazeNatureContext extends NatureContext {

	public MazeNatureContext(CityWorldGenerator generator) {
		super(generator);

		oddsOfParks = Odds.oddsUnlikely;
		oddsOfIsolatedLots = Odds.oddsLikely;
		oddsOfIdenticalBuildingHeights = Odds.oddsExtremelyLikely;
		oddsOfSimilarBuildingHeights = Odds.oddsExtremelyLikely;
		oddsOfSimilarBuildingRounding = Odds.oddsExtremelyLikely;
		oddsOfUnfinishedBuildings = Odds.oddsPrettyUnlikely;
		oddsOfOnlyUnfinishedBasements = Odds.oddsVeryUnlikely;

		oddsOfArt = Odds.oddsExceedinglyLikely;
		oddsOfNaturalArt = Odds.oddsUnlikely;

		oddsOfStairWallMaterialIsWallMaterial = Odds.oddsExtremelyLikely;
		oddsOfBuildingWallInset = Odds.oddsExtremelyLikely;
		oddsOfFlatWalledBuildings = Odds.oddsExtremelyLikely;
		oddsOfSimilarInsetBuildings = Odds.oddsExtremelyLikely;
		rangeOfWallInset = 2;

		setSchematicFamily(SchematicFamily.MIDRISE);

		maximumFloorsAbove = absoluteMaximumFloorsAbove / 3;
		maximumFloorsBelow = 2;
	}

	@Override
	public PlatLot createNaturalLot(CityWorldGenerator generator, PlatMap platmap, int x, int z) {
		return new MazeNatureLot(platmap, platmap.originX + x, platmap.originZ + z);
	}
}
