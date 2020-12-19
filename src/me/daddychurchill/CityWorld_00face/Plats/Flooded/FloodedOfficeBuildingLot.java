package me.daddychurchill.CityWorld_00face.Plats.Flooded;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.Urban.OfficeBuildingLot;
import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.EmptyWithNothing;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.EmptyWithRooms;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.SupportBlocks;

public class FloodedOfficeBuildingLot extends OfficeBuildingLot {

	public FloodedOfficeBuildingLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);

	}

	private static final RoomProvider contentsEmpty = new EmptyWithNothing();
	private static final RoomProvider contentsWalls = new EmptyWithRooms();

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new FloodedOfficeBuildingLot(platmap, chunkX, chunkZ);
	}

	@Override
	public RoomProvider roomProviderForFloor(CityWorldGenerator generator, SupportBlocks chunk, int floor, int floorY) {
		if (generator.shapeProvider.findFloodY(generator, chunk.getOriginX(), chunk.getOriginZ()) < floorY)
			return super.roomProviderForFloor(generator, chunk, floor, floorY);
		else {
			switch (contentStyle) {
			case OFFICES:
			case CUBICLES:
				return contentsWalls;
			case RANDOM:
				if (chunkOdds.flipCoin())
					return contentsWalls;
				else
					return contentsEmpty;
			default:
				return contentsEmpty;
			}
		}
	}
}
