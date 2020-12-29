package me.daddychurchill.CityWorld_00face.Plugins;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;
import me.daddychurchill.CityWorld_00face.Support.Odds;
import me.daddychurchill.CityWorld_00face.Support.SupportBlocks;

public class OreProvider_Astral extends OreProvider_Normal {

	public OreProvider_Astral(CityWorldGenerator generator) {
		super(generator);

		surfaceMaterial = Material.SOUL_SAND;
		subsurfaceMaterial = Material.SOUL_SOIL;
		stratumMaterial = Material.NETHERRACK;
		substratumMaterial = Material.BEDROCK;

		fluidMaterial = Material.LAVA;
		fluidFluidMaterial = Material.LAVA;
		fluidSurfaceMaterial = Material.FROSTED_ICE;
		fluidSubsurfaceMaterial = Material.FROSTED_ICE;
		fluidFrozenMaterial = Material.FROSTED_ICE;
	}

	@Override
	public void sprinkleSnow(CityWorldGenerator generator, SupportBlocks chunk, Odds odds, int x1, int x2, int y,
			int z1, int z2) {
	}

	@Override
	public void dropSnow(CityWorldGenerator generator, SupportBlocks chunk, int x, int y, int z) {
	}

	@Override
	public void dropSnow(CityWorldGenerator generator, SupportBlocks chunk, int x, int y, int z, double level) {
		// do nothing
	}
}
