package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.LibraryDoubleRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LibrarySingleRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LibraryStudyRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeChairsRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeCouchRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeEllCouchRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeGameRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeQuadRoom;
import me.daddychurchill.CityWorld_00face.Rooms.LoungeTrioRoom;

public class LibraryWithLounges extends RoomProvider {

	public LibraryWithLounges() {
		super();

		roomTypes.add(new LibrarySingleRoom());
		roomTypes.add(new LibraryDoubleRoom());
		roomTypes.add(new LibraryStudyRoom());

		roomTypes.add(new LoungeEllCouchRoom());
		roomTypes.add(new LoungeTrioRoom());
		roomTypes.add(new LoungeQuadRoom());
		roomTypes.add(new LoungeChairsRoom());
		roomTypes.add(new LoungeGameRoom());
		roomTypes.add(new LoungeCouchRoom());
	}

}
