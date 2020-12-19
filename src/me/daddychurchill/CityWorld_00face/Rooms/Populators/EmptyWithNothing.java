package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.EmptyRoom;

public class EmptyWithNothing extends RoomProvider {

	public EmptyWithNothing() {
		super();

		roomTypes.add(new EmptyRoom());
	}

}
