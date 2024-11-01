
package net.mcreator.rpgclasses.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.rpgclasses.entity.SlimeBossEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SlimeBossRenderer extends MobRenderer<SlimeBossEntity, SlimeModel<SlimeBossEntity>> {
	public SlimeBossRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	protected void scale(SlimeBossEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(10f, 10f, 10f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlimeBossEntity entity) {
		return new ResourceLocation("rpg_classes:textures/entities/slime.png");
	}
}
