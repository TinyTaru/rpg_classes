
package net.mcreator.rpgclasses.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.rpgclasses.world.inventory.AdvancedAnvilguiMenu;
import net.mcreator.rpgclasses.procedures.BlacksmithCraftingProcedure;
import net.mcreator.rpgclasses.RpgClassesMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdvancedAnvilguiSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public AdvancedAnvilguiSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public AdvancedAnvilguiSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(AdvancedAnvilguiSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(AdvancedAnvilguiSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = AdvancedAnvilguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 2 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
		if (slot == 3 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
		if (slot == 4 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
		if (slot == 5 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
		if (slot == 6 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
		if (slot == 7 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
		if (slot == 9 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
		if (slot == 10 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
		if (slot == 12 && changeType == 0) {

			BlacksmithCraftingProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RpgClassesMod.addNetworkMessage(AdvancedAnvilguiSlotMessage.class, AdvancedAnvilguiSlotMessage::buffer, AdvancedAnvilguiSlotMessage::new, AdvancedAnvilguiSlotMessage::handler);
	}
}
