package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.DebugRoom;

class DebugWithDebug extends RoomProvider {

	public DebugWithDebug() {
		super();

		roomTypes.add(new DebugRoom());
	}

}
