package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.DeskAdminRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskCornerRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskCubbyRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskForTwoRoom;
import me.daddychurchill.CityWorld_00face.Rooms.DeskInternsRoom;
import me.daddychurchill.CityWorld_00face.Rooms.MeetingForFourRoom;
import me.daddychurchill.CityWorld_00face.Rooms.MeetingForSixRoom;

public class OfficeWithCubicles extends RoomProvider {

	public OfficeWithCubicles() {
		super();

//		roomTypes.add(new DebugRoom());

		roomTypes.add(new MeetingForSixRoom());
		roomTypes.add(new MeetingForFourRoom());

		roomTypes.add(new DeskCubbyRoom());
		roomTypes.add(new DeskForTwoRoom());
		roomTypes.add(new DeskAdminRoom());
		roomTypes.add(new DeskCornerRoom());
		roomTypes.add(new DeskCornerRoom());
		roomTypes.add(new DeskInternsRoom());
		roomTypes.add(new DeskInternsRoom());

		// single table
		// double table
		// workbench
		// anvil
		// chest
	}

}
