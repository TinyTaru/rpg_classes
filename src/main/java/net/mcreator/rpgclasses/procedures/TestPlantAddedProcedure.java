package net.mcreator.rpgclasses.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rpgclasses.RpgClassesMod;

public class TestPlantAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RpgClassesMod.queueServerWork(30, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AMETHYST_CLUSTER.defaultBlockState(), 3);
		});
	}
}
