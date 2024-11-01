
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.rpgclasses.world.inventory.ClassChooseGUIMenu;
import net.mcreator.rpgclasses.world.inventory.AdvancedBrewingUIMenu;
import net.mcreator.rpgclasses.world.inventory.AdvancedAnvilguiMenu;
import net.mcreator.rpgclasses.RpgClassesMod;

public class RpgClassesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RpgClassesMod.MODID);
	public static final RegistryObject<MenuType<ClassChooseGUIMenu>> CLASS_CHOOSE_GUI = REGISTRY.register("class_choose_gui", () -> IForgeMenuType.create(ClassChooseGUIMenu::new));
	public static final RegistryObject<MenuType<AdvancedBrewingUIMenu>> ADVANCED_BREWING_UI = REGISTRY.register("advanced_brewing_ui", () -> IForgeMenuType.create(AdvancedBrewingUIMenu::new));
	public static final RegistryObject<MenuType<AdvancedAnvilguiMenu>> ADVANCED_ANVILGUI = REGISTRY.register("advanced_anvilgui", () -> IForgeMenuType.create(AdvancedAnvilguiMenu::new));
}
