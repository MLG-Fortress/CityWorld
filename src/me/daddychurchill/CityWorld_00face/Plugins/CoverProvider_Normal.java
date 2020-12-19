package me.daddychurchill.CityWorld_00face.Plugins;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.SupportBlocks;

public class CoverProvider_Normal extends CoverProvider {

	public CoverProvider_Normal(Odds odds) {
		super(odds);
	}

	@Override
	public void generateCoverage(CityWorldGenerator generator, SupportBlocks chunk, int x, int y, int z,
			CoverageType coverageType) {
		if (likelyCover(generator))
			setCoverage(generator, chunk, x, y, z, coverageType);
	}

}
