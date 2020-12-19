package me.daddychurchill.CityWorld_00face.Context;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;

abstract class RuralContext extends CivilizedContext {

	RuralContext(CityWorldGenerator generator) {
		super(generator);

		maximumFloorsAbove = 1;
		maximumFloorsBelow = 1;
	}
}
