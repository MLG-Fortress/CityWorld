package me.daddychurchill.CityWorld_00face.Plats.Urban;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.EmptyWithRooms;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.SupportBlocks;

public class EmptyBuildingLot extends LibraryBuildingLot {

	private static final RoomProvider contentsRooms = new EmptyWithRooms();

	public EmptyBuildingLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RoomProvider roomProviderForFloor(CityWorldGenerator generator, SupportBlocks chunk, int floor, int floorY) {
		return contentsRooms;
	}

	@Override
	protected InteriorStyle getFloorsInteriorStyle(int floor) {
		int range = height / 4;
		if (floor < range)
			return InteriorStyle.WALLS_OFFICES;
		else if (floor < range * 2)
			return InteriorStyle.WALLS_ONLY;
		else if (floor < range * 3)
			return InteriorStyle.COLUMNS_OFFICES;
		else
			return InteriorStyle.COLUMNS_ONLY;
	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new EmptyBuildingLot(platmap, chunkX, chunkZ);
	}
}
