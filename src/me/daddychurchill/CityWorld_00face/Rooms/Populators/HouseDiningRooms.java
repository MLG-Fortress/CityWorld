package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.MeetingForFourRoom;
import me.daddychurchill.CityWorld_00face.Rooms.MeetingForSixRoom;

class HouseDiningRooms extends RoomProvider {

	public HouseDiningRooms() {
		super();

		roomTypes.add(new MeetingForFourRoom());
		roomTypes.add(new MeetingForSixRoom());

	}

}
