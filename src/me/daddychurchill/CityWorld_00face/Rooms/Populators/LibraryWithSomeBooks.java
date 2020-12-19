package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.LibraryDoubleRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleShelvesRoom;

public class LibraryWithSomeBooks extends RoomProvider {

	public LibraryWithSomeBooks() {
		super();

		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new LibraryDoubleRoom());
		roomTypes.add(new LibraryDoubleRoom());
	}

}
