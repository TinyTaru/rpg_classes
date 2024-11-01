
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.rpgclasses.potion.SplinterMobEffect;
import net.mcreator.rpgclasses.RpgClassesMod;

public class RpgClassesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RpgClassesMod.MODID);
	public static final RegistryObject<MobEffect> SPLINTER = REGISTRY.register("splinter", () -> new SplinterMobEffect());
}
