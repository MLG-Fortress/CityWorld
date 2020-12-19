package me.daddychurchill.CityWorld_00face.Plats.Urban;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.FinishedBuildingLot;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plugins.RoomProvider;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.LibraryWithAllBooks;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.LibraryWithLounges;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.LibraryWithMostlyBooks;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.LibraryWithNoBooks;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.LibraryWithRandom;
import me.daddychurchill.CityWorld_00face.Rooms.Populators.LibraryWithSomeBooks;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.SupportBlocks;

public class LibraryBuildingLot extends FinishedBuildingLot {

	private static final RoomProvider contentsRandom = new LibraryWithRandom();
	private static final RoomProvider contentsNoBooks = new LibraryWithNoBooks();
	private static final RoomProvider contentsSomeBooks = new LibraryWithSomeBooks();
	private static final RoomProvider contentsMostlyBooks = new LibraryWithMostlyBooks();
	private static final RoomProvider contentsAllBooks = new LibraryWithAllBooks();
	private static final RoomProvider contentsLounges = new LibraryWithLounges();

	public LibraryBuildingLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RoomProvider roomProviderForFloor(CityWorldGenerator generator, SupportBlocks chunk, int floor, int floorY) {
		if (floor == 0)
			return contentsLounges;
		else
			switch (chunkOdds.getRandomInt(5)) {
			case 1:
				return contentsNoBooks;
			case 2:
				return contentsSomeBooks;
			case 3:
				return contentsMostlyBooks;
			case 4:
				return contentsAllBooks;
			default:
				return contentsRandom;
			}
	}

	@Override
	protected InteriorStyle getFloorsInteriorStyle(int floor) {
		if (floor == 0)
			return InteriorStyle.COLUMNS_OFFICES;
		else
			return super.getFloorsInteriorStyle(floor);
	}

	@Override
	protected InteriorStyle pickInteriorStyle() {
		switch (chunkOdds.getRandomInt(10)) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			return InteriorStyle.COLUMNS_OFFICES;
		case 9:
		default:
			return InteriorStyle.COLUMNS_ONLY;
		}
	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new LibraryBuildingLot(platmap, chunkX, chunkZ);
	}

}
