package me.daddychurchill.CityWorld_00face.Context;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Clipboard.PasteProvider.SchematicFamily;
import me.daddychurchill.CityWorld_00face.Support.Odds;

public class HighriseContext extends UrbanContext {

	public HighriseContext(CityWorldGenerator generator) {
		super(generator);

		oddsOfParks = Odds.oddsNeverGoingToHappen;
		oddsOfIsolatedLots = Odds.oddsLikely;
		oddsOfIdenticalBuildingHeights = Odds.oddsExtremelyLikely;
		oddsOfSimilarBuildingHeights = Odds.oddsExtremelyLikely;
		oddsOfSimilarBuildingRounding = Odds.oddsExtremelyLikely;
		oddsOfUnfinishedBuildings = Odds.oddsPrettyUnlikely;
		oddsOfOnlyUnfinishedBasements = Odds.oddsNeverGoingToHappen;
		// oddsOfMissingRoad = oddsNeverGoingToHappen;
		oddsOfRoundAbouts = Odds.oddsNeverGoingToHappen;

		oddsOfStairWallMaterialIsWallMaterial = Odds.oddsExtremelyLikely;
		oddsOfBuildingWallInset = Odds.oddsExtremelyLikely;
		oddsOfFlatWalledBuildings = Odds.oddsExtremelyLikely;
		oddsOfSimilarInsetBuildings = Odds.oddsExtremelyLikely;
		rangeOfWallInset = 1;

		setSchematicFamily(SchematicFamily.HIGHRISE);

		minSizeOfBuilding = 2;

		maximumFloorsAbove = absoluteMaximumFloorsAbove;
		maximumFloorsBelow = 3;
	}

}
