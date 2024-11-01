
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.rpgclasses.client.gui.ClassChooseGUIScreen;
import net.mcreator.rpgclasses.client.gui.AdvancedBrewingUIScreen;
import net.mcreator.rpgclasses.client.gui.AdvancedAnvilguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RpgClassesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RpgClassesModMenus.CLASS_CHOOSE_GUI.get(), ClassChooseGUIScreen::new);
			MenuScreens.register(RpgClassesModMenus.ADVANCED_BREWING_UI.get(), AdvancedBrewingUIScreen::new);
			MenuScreens.register(RpgClassesModMenus.ADVANCED_ANVILGUI.get(), AdvancedAnvilguiScreen::new);
		});
	}
}
