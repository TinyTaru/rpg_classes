package net.mcreator.rpgclasses.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.rpgclasses.item.PaladinarmorsetItem;

public class PaladinarmorsetModel extends GeoModel<PaladinarmorsetItem> {
	@Override
	public ResourceLocation getAnimationResource(PaladinarmorsetItem object) {
		return new ResourceLocation("rpg_classes", "animations/paladin_armor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaladinarmorsetItem object) {
		return new ResourceLocation("rpg_classes", "geo/paladin_armor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaladinarmorsetItem object) {
		return new ResourceLocation("rpg_classes", "textures/item/paladin_armor_texture.png");
	}
}
