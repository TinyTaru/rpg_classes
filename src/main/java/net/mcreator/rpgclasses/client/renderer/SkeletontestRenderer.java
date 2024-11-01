
package net.mcreator.rpgclasses.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.rpgclasses.entity.SkeletontestEntity;
import net.mcreator.rpgclasses.client.model.ModelKCRPlayerModelBaseJava;

public class SkeletontestRenderer extends MobRenderer<SkeletontestEntity, ModelKCRPlayerModelBaseJava<SkeletontestEntity>> {
	public SkeletontestRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKCRPlayerModelBaseJava(context.bakeLayer(ModelKCRPlayerModelBaseJava.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkeletontestEntity entity) {
		return new ResourceLocation("rpg_classes:textures/entities/texture_java_test.png");
	}
}
