
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rpgclasses.block.TestBlock;
import net.mcreator.rpgclasses.block.ClassTableBlock;
import net.mcreator.rpgclasses.block.AdvancedBrewingStandBlock;
import net.mcreator.rpgclasses.block.AdvancedAnvilBlock;
import net.mcreator.rpgclasses.RpgClassesMod;

public class RpgClassesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RpgClassesMod.MODID);
	public static final RegistryObject<Block> CLASS_TABLE = REGISTRY.register("class_table", () -> new ClassTableBlock());
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> ADVANCED_BREWING_STAND = REGISTRY.register("advanced_brewing_stand", () -> new AdvancedBrewingStandBlock());
	public static final RegistryObject<Block> ADVANCED_ANVIL = REGISTRY.register("advanced_anvil", () -> new AdvancedAnvilBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
