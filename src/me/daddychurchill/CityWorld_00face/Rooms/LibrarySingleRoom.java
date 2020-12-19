package me.daddychurchill.CityWorld_00face.Rooms;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class LibrarySingleRoom extends LibraryRoom {

	public LibrarySingleRoom() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawFixture(CityWorldGenerator generator, RealBlocks chunk, Odds odds, int floor, int x, int y, int z,
			int width, int height, int depth, BlockFace sideWithWall, Material materialWall, Material materialGlass) {
		int offset;
		switch (sideWithWall) {
		default:
		case NORTH:
		case SOUTH:
			offset = odds.getRandomInt(width);
			chunk.setBlocks(x + offset, x + 1 + offset, y, y + height, z, z + depth, Material.BOOKSHELF);
			break;
		case WEST:
		case EAST:
			offset = odds.getRandomInt(depth);
			chunk.setBlocks(x, x + width, y, y + height, z + offset, z + 1 + offset, Material.BOOKSHELF);
			break;
		}
	}

}