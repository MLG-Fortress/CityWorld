package me.daddychurchill.CityWorld_00face.Context.Astral;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.Astral.AstralCrystalSpiresLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Support.HeightInfo;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.SupportBlocks;

public class AstralCrystalSpiresContext extends AstralDataContext {

	public AstralCrystalSpiresContext(CityWorldGenerator generator) {
		super(generator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void populateMap(CityWorldGenerator generator, PlatMap platmap) {

		// TODO, This doesn't handle schematics quite right yet
		// let the user add their stuff first, then plug any remaining holes with our
		// stuff
		// mapsSchematics.populate(generator, platmap);

		// where it all begins
		int originX = platmap.originX;
		int originZ = platmap.originZ;
		HeightInfo heights;

		// is this natural or buildable?
		for (int x = 0; x < PlatMap.Width; x++) {
			for (int z = 0; z < PlatMap.Width; z++) {
				PlatLot current = platmap.getLot(x, z);
				if (current == null) {

					// what is the world location of the lot?
					int blockX = (originX + x) * SupportBlocks.sectionBlockWidth;
					int blockZ = (originZ + z) * SupportBlocks.sectionBlockWidth;

					// get the height info for this chunk
					heights = HeightInfo.getHeightsFaster(generator, blockX, blockZ);
					if (heights.getAverageHeight() > 0 && heights.getAverageHeight() < generator.seaLevel)
						current = new AstralCrystalSpiresLot(platmap, originX + x, originZ + z,
								getPopulationOdds(x, z));

					// did current get defined?
					if (current != null)
						platmap.setLot(x, z, current);
				}
			}
		}
	}

	@Override
	public void validateMap(CityWorldGenerator generator, PlatMap platmap) {
		// TODO Auto-generated method stub

	}

	@Override
	public Material getMapRepresentation() {
		return Material.GLASS_PANE;
	}
}
