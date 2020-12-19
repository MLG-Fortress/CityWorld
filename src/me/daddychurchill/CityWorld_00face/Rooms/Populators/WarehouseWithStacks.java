package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.StorageStacksRoom;

public class WarehouseWithStacks extends RoomProvider {

	public WarehouseWithStacks() {
		super();

		roomTypes.add(new StorageStacksRoom(Material.BOOKSHELF));
		roomTypes.add(new StorageStacksRoom(Material.PISTON));
		roomTypes.add(new StorageStacksRoom(Material.CRAFTING_TABLE));
	}

}
