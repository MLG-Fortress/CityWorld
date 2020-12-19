package me.daddychurchill.CityWorld_00face.Clipboard;

import org.bukkit.block.BlockFace;

import me.daddychurchill.CityWorld_00face.Support.PlatMap;

public class ClipboardRoundaboutLot extends ClipboardRoadLot {

	public ClipboardRoundaboutLot(PlatMap platmap, int chunkX, int chunkZ, Clipboard clip, BlockFace facing, int lotX,
			int lotZ) {
		super(platmap, chunkX, chunkZ, clip, facing, lotX, lotZ);

		style = LotStyle.ROUNDABOUT;
	}

}
