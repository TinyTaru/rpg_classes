
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.rpgclasses.RpgClassesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RpgClassesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RpgClassesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(RpgClassesModBlocks.CLASS_TABLE.get().asItem());
			tabData.accept(RpgClassesModBlocks.ADVANCED_BREWING_STAND.get().asItem());
			tabData.accept(RpgClassesModBlocks.ADVANCED_ANVIL.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RpgClassesModItems.PALADIN_ARMOR_HELMET.get());
			tabData.accept(RpgClassesModItems.PALADIN_ARMOR_CHESTPLATE.get());
			tabData.accept(RpgClassesModItems.PALADIN_ARMOR_LEGGINGS.get());
			tabData.accept(RpgClassesModItems.PALADIN_ARMOR_BOOTS.get());
			tabData.accept(RpgClassesModItems.IRON_SHIELD.get());
			tabData.accept(RpgClassesModItems.DIAMONDCHAINMILL_HELMET.get());
			tabData.accept(RpgClassesModItems.DIAMONDCHAINMILL_CHESTPLATE.get());
			tabData.accept(RpgClassesModItems.DIAMONDCHAINMILL_LEGGINGS.get());
			tabData.accept(RpgClassesModItems.DIAMONDCHAINMILL_BOOTS.get());
			tabData.accept(RpgClassesModItems.SCYTHE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RpgClassesModItems.SLIME_BOSS_SPAWN_EGG.get());
			tabData.accept(RpgClassesModItems.SKELETONTEST_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RpgClassesModBlocks.TEST.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RpgClassesModItems.DIALMOND_HAMMER.get());
			tabData.accept(RpgClassesModItems.BONE_BASHER.get());
			tabData.accept(RpgClassesModItems.IRON_DAGGER.get());
			tabData.accept(RpgClassesModItems.DIAMOND_DAGGER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(RpgClassesModItems.SPLINTER_POTION_ITEM.get());
			tabData.accept(RpgClassesModItems.SPEED_3.get());
		}
	}
}
