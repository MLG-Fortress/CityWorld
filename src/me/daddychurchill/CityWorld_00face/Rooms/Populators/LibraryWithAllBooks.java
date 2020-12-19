package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.LibraryDoubleRoom;

public class LibraryWithAllBooks extends RoomProvider {

	public LibraryWithAllBooks() {
		super();

		roomTypes.add(new LibraryDoubleRoom());
	}

}
