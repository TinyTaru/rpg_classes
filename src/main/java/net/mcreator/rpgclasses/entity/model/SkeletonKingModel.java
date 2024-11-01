package net.mcreator.rpgclasses.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rpgclasses.entity.SkeletonKingEntity;

public class SkeletonKingModel extends GeoModel<SkeletonKingEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkeletonKingEntity entity) {
		return new ResourceLocation("rpg_classes", "animations/skeleton_king.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeletonKingEntity entity) {
		return new ResourceLocation("rpg_classes", "geo/skeleton_king.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeletonKingEntity entity) {
		return new ResourceLocation("rpg_classes", "textures/entities/" + entity.getTexture() + ".png");
	}

}
