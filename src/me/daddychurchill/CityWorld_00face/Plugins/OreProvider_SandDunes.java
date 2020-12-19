package me.daddychurchill.CityWorld_00face.Plugins;

import org.bukkit.Material;

import me.daddychurchill.CityWorld_00face.CityWorldGenerator;

class OreProvider_SandDunes extends OreProvider_Normal {

	public OreProvider_SandDunes(CityWorldGenerator generator) {
		super(generator);

		fluidMaterial = Material.SAND;
		fluidFluidMaterial = Material.SAND;
		fluidSurfaceMaterial = Material.SAND;
		fluidSubsurfaceMaterial = Material.SANDSTONE;
		fluidFrozenMaterial = Material.SANDSTONE;
	}
}
