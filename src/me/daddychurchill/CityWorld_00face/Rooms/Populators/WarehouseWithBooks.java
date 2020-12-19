package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleRowRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageSingleRowRoom;

public class WarehouseWithBooks extends RoomProvider {

	public WarehouseWithBooks() {
		super();

		roomTypes.add(new StorageSingleRowRoom(Material.BOOKSHELF));
		roomTypes.add(new StorageDoubleRowRoom(Material.BOOKSHELF));
	}

}
