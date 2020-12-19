package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.*;

public class BuriedWithRandom extends RoomProvider {

	public BuriedWithRandom() {
		super();

//		roomTypes.add(new DebugRoom());

//		roomTypes.add(new EmptyRoom());

		roomTypes.add(new LoungeCouchRoom());
		roomTypes.add(new LoungeTableRoom());
		roomTypes.add(new LoungeQuadRoom());
		roomTypes.add(new LoungeTrioRoom());

		roomTypes.add(new MeetingForSixRoom());
		roomTypes.add(new MeetingForFourRoom());

		roomTypes.add(new DeskExecutiveRoom());
		roomTypes.add(new DeskAdminRoom());
		roomTypes.add(new DeskCornerRoom());
		roomTypes.add(new DeskCornerRoom());
		roomTypes.add(new DeskInternsRoom());
		roomTypes.add(new DeskInternsRoom());
	}

}
