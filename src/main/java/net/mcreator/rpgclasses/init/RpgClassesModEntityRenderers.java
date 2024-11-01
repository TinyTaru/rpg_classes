
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.rpgclasses.client.renderer.SlimeBossRenderer;
import net.mcreator.rpgclasses.client.renderer.SkeletontestRenderer;
import net.mcreator.rpgclasses.client.renderer.SkeletonKingRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RpgClassesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RpgClassesModEntities.SLIME_BOSS.get(), SlimeBossRenderer::new);
		event.registerEntityRenderer(RpgClassesModEntities.SKELETON_KING.get(), SkeletonKingRenderer::new);
		event.registerEntityRenderer(RpgClassesModEntities.SKELETONTEST.get(), SkeletontestRenderer::new);
	}
}
