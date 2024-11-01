
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.rpgclasses.block.entity.ClassTableBlockEntity;
import net.mcreator.rpgclasses.block.entity.AdvancedBrewingStandBlockEntity;
import net.mcreator.rpgclasses.block.entity.AdvancedAnvilBlockEntity;
import net.mcreator.rpgclasses.RpgClassesMod;

public class RpgClassesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RpgClassesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CLASS_TABLE = register("class_table", RpgClassesModBlocks.CLASS_TABLE, ClassTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ADVANCED_BREWING_STAND = register("advanced_brewing_stand", RpgClassesModBlocks.ADVANCED_BREWING_STAND, AdvancedBrewingStandBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ADVANCED_ANVIL = register("advanced_anvil", RpgClassesModBlocks.ADVANCED_ANVIL, AdvancedAnvilBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
