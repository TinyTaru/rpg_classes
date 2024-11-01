package net.mcreator.rpgclasses.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.rpgclasses.init.RpgClassesModMobEffects;

public class SplinterPotionItemPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(RpgClassesModMobEffects.SPLINTER.get(), 200, 1, false, true));
	}
}
