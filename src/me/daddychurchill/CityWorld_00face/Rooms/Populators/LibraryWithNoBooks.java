package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleShelvesRoom;

public class LibraryWithNoBooks extends RoomProvider {

	public LibraryWithNoBooks() {
		super();

		roomTypes.add(new StorageDoubleShelvesRoom());
	}

}
