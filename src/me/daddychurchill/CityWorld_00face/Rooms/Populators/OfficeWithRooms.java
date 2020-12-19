package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.ClosetRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskAdminRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskCornerRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskCubbyRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskExecutiveRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskForTwoRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DividedEllRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DividedSingleRoom;
import me.daddychurchill.CityWorld_00face.Rooms.EmptyRoom;

public class OfficeWithRooms extends RoomProvider {

	public OfficeWithRooms() {
		super();

//		roomTypes.add(new DebugRoom());

		roomTypes.add(new EmptyRoom());

		roomTypes.add(new ClosetRoom());

		roomTypes.add(new DividedSingleRoom());
		roomTypes.add(new DividedEllRoom());

		roomTypes.add(new DeskCubbyRoom());
		roomTypes.add(new DeskForTwoRoom());
		roomTypes.add(new DeskExecutiveRoom());
		roomTypes.add(new DeskAdminRoom());
		roomTypes.add(new DeskCornerRoom());

		// two wide table with chair and a book stand (with possible flower pot)
	}

}
