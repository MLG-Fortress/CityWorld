package me.daddychurchill.CityWorld_00face.Plats.Urban;

import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Plats.FinishedBuildingLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public abstract class IndustrialBuildingLot extends FinishedBuildingLot {

	IndustrialBuildingLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);

		height = 1;
		depth = 0;
		roofStyle = chunkOdds.flipCoin() ? RoofStyle.EDGED : RoofStyle.FLATTOP;
		roofFeature = roofFeature == RoofFeature.ANTENNAS ? RoofFeature.CONDITIONERS : roofFeature;
		insetStyle = InsetStyle.STRAIGHT;
		rounded = false;
	}

	@Override
	protected void calculateOptions(DataContext context) {
		super.calculateOptions(context);

		// how do the walls inset?
		insetWallWE = 1;
		insetWallNS = 1;

		// what about the ceiling?
		insetCeilingWE = insetWallWE;
		insetCeilingNS = insetWallNS;

		// nudge in a bit more as we go up
		insetInsetMidAt = 1;
		insetInsetHighAt = 1;
		insetStyle = InsetStyle.STRAIGHT;
	}

}
