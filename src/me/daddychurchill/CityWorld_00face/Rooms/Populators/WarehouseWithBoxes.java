package me.daddychurchill.CityWorld_00face.Rooms.Populators;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.StorageDoubleRowRoom;

public class WarehouseWithBoxes extends RoomProvider {

	public WarehouseWithBoxes() {
		super();

		roomTypes.add(new StorageDoubleRowRoom(Material.PISTON));
	}

}
