package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.StorageEmptyChestsRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageFilledChestsRoom;

public class WarehouseWithChests extends RoomProvider {

	public WarehouseWithChests() {
		super();

		roomTypes.add(new StorageFilledChestsRoom());
		roomTypes.add(new StorageFilledChestsRoom());
		roomTypes.add(new StorageFilledChestsRoom());
		roomTypes.add(new StorageEmptyChestsRoom());
	}

}
