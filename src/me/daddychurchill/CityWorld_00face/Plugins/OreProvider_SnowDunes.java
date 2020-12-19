package me.daddychurchill.CityWorld_00face.Plugins;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;

class OreProvider_SnowDunes extends OreProvider_Normal {

	public OreProvider_SnowDunes(CityWorldGenerator generator) {
		super(generator);

		fluidMaterial = Material.FROSTED_ICE;
		fluidFluidMaterial = Material.SNOW_BLOCK;
		fluidSurfaceMaterial = Material.PACKED_ICE;
		fluidSubsurfaceMaterial = Material.PACKED_ICE;
		fluidFrozenMaterial = Material.PACKED_ICE;
	}
}
