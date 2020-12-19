package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.EmptyRoom;
import me.daddychurchill.CityWorld_00face.Rooms.RegisterRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleShelvesRoom;

public class StoreWithNothing extends RoomProvider {

	public StoreWithNothing() {
		super();

		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new EmptyRoom());
		roomTypes.add(new EmptyRoom());
		roomTypes.add(new EmptyRoom());
		roomTypes.add(new EmptyRoom());
		roomTypes.add(new RegisterRoom());
	}

}
