package me.daddychurchill.CityWorld_00face.Plats.Maze;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Context.DataContext;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;
import me.daddychurchill.CityWorld_00face.Support.RealBlocks;

public class MazeCoveredLot extends MazeNatureLot {

	public MazeCoveredLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void generateActualBlocks(CityWorldGenerator generator, PlatMap platmap, RealBlocks chunk,
			DataContext context, int platX, int platZ) {
		super.generateActualBlocks(generator, platmap, chunk, context, platX, platZ);

		// top it off
		Material wallMaterial = getWallMaterial(generator);
		int y = generator.streetLevel + mazeHeight - mazeDepth - 1;
		chunk.setBlocks(0, 16, y, 0, 16, wallMaterial);
		chunk.setWalls(0, 16, generator.streetLevel + 4, y, 0, 16, wallMaterial);
	}
}