package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleRowRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleShelvesRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageEmptyChestsRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageFilledChestsRoom;

public class WarehouseWithRandom extends RoomProvider {

	public WarehouseWithRandom() {
		super();

		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new StorageDoubleRowRoom(Material.BOOKSHELF));
		roomTypes.add(new StorageDoubleRowRoom(Material.PISTON));
		roomTypes.add(new StorageDoubleRowRoom(Material.CRAFTING_TABLE));
		roomTypes.add(new StorageFilledChestsRoom());
		roomTypes.add(new StorageEmptyChestsRoom());
	}
}
