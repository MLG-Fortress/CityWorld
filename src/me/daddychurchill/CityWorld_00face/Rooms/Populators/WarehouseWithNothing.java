package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.EmptyRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleShelvesRoom;

public class WarehouseWithNothing extends RoomProvider {

	public WarehouseWithNothing() {
		super();

		roomTypes.add(new EmptyRoom());
		roomTypes.add(new StorageDoubleShelvesRoom());
	}

}
