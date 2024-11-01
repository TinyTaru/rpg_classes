
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.rpgclasses.network.SecondaryAbilityMessage;
import net.mcreator.rpgclasses.network.PrimaryAbilityMessage;
import net.mcreator.rpgclasses.RpgClassesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RpgClassesModKeyMappings {
	public static final KeyMapping PRIMARY_ABILITY = new KeyMapping("key.rpg_classes.primary_ability", GLFW.GLFW_KEY_G, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RpgClassesMod.PACKET_HANDLER.sendToServer(new PrimaryAbilityMessage(0, 0));
				PrimaryAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SECONDARY_ABILITY = new KeyMapping("key.rpg_classes.secondary_ability", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RpgClassesMod.PACKET_HANDLER.sendToServer(new SecondaryAbilityMessage(0, 0));
				SecondaryAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(PRIMARY_ABILITY);
		event.register(SECONDARY_ABILITY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				PRIMARY_ABILITY.consumeClick();
				SECONDARY_ABILITY.consumeClick();
			}
		}
	}
}
