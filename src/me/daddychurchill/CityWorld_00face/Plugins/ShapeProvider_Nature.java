package me.daddychurchill.CityWorld_00face.Plugins;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class ShapeProvider_Nature extends ShapeProvider_Normal {

	public ShapeProvider_Nature(CityWorldGenerator generator, Odds odds) {
		super(generator, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public DataContext getContext(PlatMap platmap) {
		return natureContext;
	}
}
