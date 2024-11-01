
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.rpgclasses.entity.SlimeBossEntity;
import net.mcreator.rpgclasses.entity.SkeletontestEntity;
import net.mcreator.rpgclasses.entity.SkeletonKingEntity;
import net.mcreator.rpgclasses.RpgClassesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RpgClassesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RpgClassesMod.MODID);
	public static final RegistryObject<EntityType<SlimeBossEntity>> SLIME_BOSS = register("slime_boss",
			EntityType.Builder.<SlimeBossEntity>of(SlimeBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimeBossEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<SkeletonKingEntity>> SKELETON_KING = register("skeleton_king",
			EntityType.Builder.<SkeletonKingEntity>of(SkeletonKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeletonKingEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SkeletontestEntity>> SKELETONTEST = register("skeletontest",
			EntityType.Builder.<SkeletontestEntity>of(SkeletontestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeletontestEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SlimeBossEntity.init();
			SkeletonKingEntity.init();
			SkeletontestEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SLIME_BOSS.get(), SlimeBossEntity.createAttributes().build());
		event.put(SKELETON_KING.get(), SkeletonKingEntity.createAttributes().build());
		event.put(SKELETONTEST.get(), SkeletontestEntity.createAttributes().build());
	}
}
