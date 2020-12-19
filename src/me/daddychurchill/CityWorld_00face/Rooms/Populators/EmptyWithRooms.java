package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.DividedEllRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DividedSingleRoom;
import me.daddychurchill.CityWorld_00face.Rooms.EmptyRoom;

public class EmptyWithRooms extends RoomProvider {

	public EmptyWithRooms() {
		super();

		roomTypes.add(new EmptyRoom());

		roomTypes.add(new DividedSingleRoom());
		roomTypes.add(new DividedEllRoom());
	}

}
