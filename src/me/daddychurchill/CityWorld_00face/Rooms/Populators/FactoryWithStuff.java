package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.EmptyRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleRowRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleShelvesRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageSingleRowRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageSingleShelvesRoom;
import me.daddychurchill.CityWorld_00face.Rooms.StorageStacksRoom;

public class FactoryWithStuff extends RoomProvider {

	public FactoryWithStuff() {
		super();

		roomTypes.add(new EmptyRoom());
		roomTypes.add(new StorageSingleShelvesRoom());
		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new StorageSingleRowRoom(Material.BOOKSHELF));
		roomTypes.add(new StorageSingleRowRoom(Material.PISTON));
		roomTypes.add(new StorageSingleRowRoom(Material.CRAFTING_TABLE));
		roomTypes.add(new StorageDoubleRowRoom(Material.BOOKSHELF));
		roomTypes.add(new StorageDoubleRowRoom(Material.PISTON));
		roomTypes.add(new StorageDoubleRowRoom(Material.CRAFTING_TABLE));
		roomTypes.add(new StorageStacksRoom(Material.BOOKSHELF));
		roomTypes.add(new StorageStacksRoom(Material.PISTON));
		roomTypes.add(new StorageStacksRoom(Material.CRAFTING_TABLE));
	}

}
