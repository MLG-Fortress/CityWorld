package me.daddychurchill.CityWorld_00face.Context;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Clipboard.PasteProvider.SchematicFamily;
import me.daddychurchill.CityWorld_00face.Support.Odds;

public class MidriseContext extends UrbanContext {

	public MidriseContext(CityWorldGenerator generator) {
		super(generator);

		oddsOfParks = Odds.oddsUnlikely;
		oddsOfIsolatedLots = Odds.oddsLikely;
		oddsOfIdenticalBuildingHeights = Odds.oddsExtremelyLikely;
		oddsOfSimilarBuildingHeights = Odds.oddsExtremelyLikely;
		oddsOfSimilarBuildingRounding = Odds.oddsExtremelyLikely;
		oddsOfUnfinishedBuildings = Odds.oddsPrettyUnlikely;
		oddsOfOnlyUnfinishedBasements = Odds.oddsNeverGoingToHappen;
		// oddsOfMissingRoad = oddsLikely;
//		oddsOfRoundAbouts = Odds.oddsLikely;

		oddsOfStairWallMaterialIsWallMaterial = Odds.oddsExtremelyLikely;
		oddsOfBuildingWallInset = Odds.oddsExtremelyLikely;
		oddsOfFlatWalledBuildings = Odds.oddsExtremelyLikely;
		oddsOfSimilarInsetBuildings = Odds.oddsExtremelyLikely;
		rangeOfWallInset = 2;

		setSchematicFamily(SchematicFamily.MIDRISE);
		minSizeOfBuilding = 2;

		maximumFloorsAbove = absoluteMaximumFloorsAbove / 2;
		maximumFloorsBelow = 3;
	}
}
