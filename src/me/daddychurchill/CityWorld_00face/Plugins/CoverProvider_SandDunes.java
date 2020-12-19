package me.daddychurchill.CityWorld_00face.Plugins;

import me.daddychurchill.CityWorld_00face.Support.Colors.ColorSet;
import me.daddychurchill.CityWorld_00face.Support.Odds;

public class CoverProvider_SandDunes extends CoverProvider_Decayed {

	public CoverProvider_SandDunes(Odds odds) {
		super(odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ColorSet getColorSet() {
		return ColorSet.TAN;
	}

}
