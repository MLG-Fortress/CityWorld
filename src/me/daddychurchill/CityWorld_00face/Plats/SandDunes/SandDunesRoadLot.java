package me.daddychurchill.CityWorld_00face.Plats.SandDunes;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Plats.PlatLot;
import me.daddychurchill.CityWorld_00face.Plats.RoadLot;
import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class SandDunesRoadLot extends RoadLot {

	public SandDunesRoadLot(PlatMap platmap, int chunkX, int chunkZ, long globalconnectionkey, boolean roundaboutPart) {
		super(platmap, chunkX, chunkZ, globalconnectionkey, roundaboutPart);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new SandDunesRoadLot(platmap, chunkX, chunkZ, connectedkey, roundaboutRoad);
	}

	@Override
	protected Material getSidewalkMaterial() {
		return Material.STONE;
	}

	@Override
	protected int getSidewalkLevel(CityWorldGenerator generator) {
		return super.getSidewalkLevel(generator);
	}
}
