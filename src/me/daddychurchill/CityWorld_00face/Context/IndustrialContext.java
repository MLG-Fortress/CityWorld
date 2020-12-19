package me.daddychurchill.CityWorld_00face.Context;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Clipboard.PasteProvider.SchematicFamily;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.FactoryBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.StorageLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.WarehouseBuildingLot;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class IndustrialContext extends UrbanContext {

	public IndustrialContext(CityWorldGenerator generator) {
		super(generator);

		oddsOfParks = Odds.oddsUnlikely;
		oddsOfIsolatedLots = Odds.oddsPrettyUnlikely;
		oddsOfIdenticalBuildingHeights = Odds.oddsAlwaysGoingToHappen;
		oddsOfSimilarBuildingHeights = Odds.oddsExtremelyLikely;
		oddsOfSimilarBuildingRounding = Odds.oddsNeverGoingToHappen;
		oddsOfUnfinishedBuildings = Odds.oddsNeverGoingToHappen;
		oddsOfOnlyUnfinishedBasements = Odds.oddsNeverGoingToHappen;
		// oddsOfMissingRoad = oddsNeverGoingToHappen;
		oddsOfRoundAbouts = Odds.oddsUnlikely;

		oddsOfStairWallMaterialIsWallMaterial = Odds.oddsExtremelyLikely;
		oddsOfBuildingWallInset = Odds.oddsExtremelyLikely;
		oddsOfFlatWalledBuildings = Odds.oddsExtremelyLikely;
		oddsOfSimilarInsetBuildings = Odds.oddsExtremelyLikely;
		rangeOfWallInset = 2;

		setSchematicFamily(SchematicFamily.INDUSTRIAL);

		maximumFloorsAbove = 2;
		maximumFloorsBelow = 1;
	}

	@Override
	protected PlatLot getPark(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ,
			int waterDepth) {
		if (odds.playOdds(Odds.oddsLikely))
			return new StorageLot(platmap, chunkX, chunkZ);
		else
			return new FactoryBuildingLot(platmap, chunkX, chunkZ);
	}

	@Override
	protected PlatLot getBuilding(CityWorldGenerator generator, PlatMap platmap, Odds odds, int chunkX, int chunkZ) {
		if (odds.playOdds(Odds.oddsSomewhatLikely))
			return new WarehouseBuildingLot(platmap, chunkX, chunkZ);
		else
			return new FactoryBuildingLot(platmap, chunkX, chunkZ);
	}
}
