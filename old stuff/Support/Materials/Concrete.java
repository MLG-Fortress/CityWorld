package me.daddychurchill.CityWorld_00face.Support.Materials;

import org.bukkit.DyeColor;
import org.bukkit.Material;

public class Concrete extends Stained_Block {

	public Concrete()
	{
		super(Material.CONCRETE);
	}

	public Concrete(DyeColor color)
	{
		this();
		setColor(color);
	}

}
