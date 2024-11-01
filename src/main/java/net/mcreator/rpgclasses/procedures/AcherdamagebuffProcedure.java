package net.mcreator.rpgclasses.procedures;

import virtuoel.pehkui.api.ScaleTypes;
import virtuoel.pehkui.api.ScaleOperations;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.rpgclasses.network.RpgClassesModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AcherdamagebuffProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(RpgClassesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RpgClassesModVariables.PlayerVariables())).Is_Archer == true
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOW) {
			ScaleTypes.ATTACK.getScaleData(entity).setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.ATTACK.getScaleData(entity).getTargetScale(), 3));
		} else {
			ScaleTypes.ATTACK.getScaleData(entity).setTargetScale((float) ScaleOperations.SET.applyAsDouble(ScaleTypes.ATTACK.getScaleData(entity).getTargetScale(), 1));
		}
	}
}
