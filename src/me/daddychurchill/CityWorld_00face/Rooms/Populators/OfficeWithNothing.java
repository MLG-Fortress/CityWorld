package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.EmptyRoom;

public class OfficeWithNothing extends RoomProvider {

	public OfficeWithNothing() {
		super();

		roomTypes.add(new EmptyRoom());
	}

}
