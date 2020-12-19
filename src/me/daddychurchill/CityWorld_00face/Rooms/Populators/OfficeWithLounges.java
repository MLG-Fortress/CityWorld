package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.EmptyRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeCouchRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeKitchenetteRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeQuadRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeTVRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeTableRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeTrioRoom;

public class OfficeWithLounges extends RoomProvider {

	public OfficeWithLounges() {
		super();

//		roomTypes.add(new DebugRoom());

		roomTypes.add(new EmptyRoom());

		roomTypes.add(new LoungeCouchRoom());
		roomTypes.add(new LoungeTableRoom());
		roomTypes.add(new LoungeTVRoom());
		roomTypes.add(new LoungeQuadRoom());
		roomTypes.add(new LoungeTrioRoom());
		roomTypes.add(new LoungeKitchenetteRoom());
	}

}
