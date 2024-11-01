
package net.mcreator.rpgclasses.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.rpgclasses.procedures.SplinterOnEffectActiveTickProcedure;

public class SplinterMobEffect extends MobEffect {
	public SplinterMobEffect() {
		super(MobEffectCategory.HARMFUL, -3368704);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SplinterOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
