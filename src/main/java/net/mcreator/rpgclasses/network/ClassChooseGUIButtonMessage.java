
package net.mcreator.rpgclasses.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.rpgclasses.world.inventory.ClassChooseGUIMenu;
import net.mcreator.rpgclasses.procedures.WichProcedure;
import net.mcreator.rpgclasses.procedures.WarriorProcedure;
import net.mcreator.rpgclasses.procedures.WarlockProcedure;
import net.mcreator.rpgclasses.procedures.RogueProcedure;
import net.mcreator.rpgclasses.procedures.BlacksmithProcedure;
import net.mcreator.rpgclasses.procedures.ArcherProcedure;
import net.mcreator.rpgclasses.RpgClassesMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClassChooseGUIButtonMessage {
	private final int buttonID, x, y, z;

	public ClassChooseGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ClassChooseGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ClassChooseGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ClassChooseGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ClassChooseGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 1) {

			WarriorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ArcherProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			RogueProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			WichProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			WarlockProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			BlacksmithProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RpgClassesMod.addNetworkMessage(ClassChooseGUIButtonMessage.class, ClassChooseGUIButtonMessage::buffer, ClassChooseGUIButtonMessage::new, ClassChooseGUIButtonMessage::handler);
	}
}
