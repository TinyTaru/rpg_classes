package net.mcreator.rpgclasses.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.rpgclasses.world.inventory.ClassChooseGUIMenu;
import net.mcreator.rpgclasses.network.ClassChooseGUIButtonMessage;
import net.mcreator.rpgclasses.RpgClassesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ClassChooseGUIScreen extends AbstractContainerScreen<ClassChooseGUIMenu> {
	private final static HashMap<String, Object> guistate = ClassChooseGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_empty_slot_diamond;
	ImageButton imagebutton_warrior_button;
	ImageButton imagebutton_archer_button;
	ImageButton imagebutton_rogue;
	ImageButton imagebutton_wich_button;
	ImageButton imagebutton_warlock_button;
	ImageButton imagebutton_blacksmith_button;

	public ClassChooseGUIScreen(ClassChooseGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 422;
		this.imageHeight = 236;
	}

	private static final ResourceLocation texture = new ResourceLocation("rpg_classes:textures/screens/class_choose_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 39 && mouseX < leftPos + 63 && mouseY > topPos + 6 && mouseY < topPos + 30)
			guiGraphics.renderTooltip(font, Component.translatable("gui.rpg_classes.class_choose_gui.tooltip_test"), mouseX, mouseY);
		if (mouseX > leftPos + 102 && mouseX < leftPos + 126 && mouseY > topPos + 6 && mouseY < topPos + 30)
			guiGraphics.renderTooltip(font, Component.translatable("gui.rpg_classes.class_choose_gui.tooltip_archer"), mouseX, mouseY);
		if (mouseX > leftPos + 165 && mouseX < leftPos + 189 && mouseY > topPos + 6 && mouseY < topPos + 30)
			guiGraphics.renderTooltip(font, Component.translatable("gui.rpg_classes.class_choose_gui.tooltip_rogue"), mouseX, mouseY);
		if (mouseX > leftPos + 228 && mouseX < leftPos + 252 && mouseY > topPos + 6 && mouseY < topPos + 30)
			guiGraphics.renderTooltip(font, Component.translatable("gui.rpg_classes.class_choose_gui.tooltip_wich"), mouseX, mouseY);
		if (mouseX > leftPos + 291 && mouseX < leftPos + 315 && mouseY > topPos + 6 && mouseY < topPos + 30)
			guiGraphics.renderTooltip(font, Component.translatable("gui.rpg_classes.class_choose_gui.tooltip_warlock"), mouseX, mouseY);
		if (mouseX > leftPos + 354 && mouseX < leftPos + 378 && mouseY > topPos + 6 && mouseY < topPos + 30)
			guiGraphics.renderTooltip(font, Component.translatable("gui.rpg_classes.class_choose_gui.tooltip_blacksmith"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("rpg_classes:textures/screens/empty_slot_lapis_lazuli.png"), this.leftPos + 93, this.topPos + 186, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("rpg_classes:textures/screens/empty_slot_emerald.png"), this.leftPos + 93, this.topPos + 150, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_empty_slot_diamond = new ImageButton(this.leftPos + 93, this.topPos + 168, 16, 16, 0, 0, 16, new ResourceLocation("rpg_classes:textures/screens/atlas/imagebutton_empty_slot_diamond.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_empty_slot_diamond", imagebutton_empty_slot_diamond);
		this.addRenderableWidget(imagebutton_empty_slot_diamond);
		imagebutton_warrior_button = new ImageButton(this.leftPos + 39, this.topPos + 6, 24, 24, 0, 0, 24, new ResourceLocation("rpg_classes:textures/screens/atlas/imagebutton_warrior_button.png"), 24, 48, e -> {
			if (true) {
				RpgClassesMod.PACKET_HANDLER.sendToServer(new ClassChooseGUIButtonMessage(1, x, y, z));
				ClassChooseGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_warrior_button", imagebutton_warrior_button);
		this.addRenderableWidget(imagebutton_warrior_button);
		imagebutton_archer_button = new ImageButton(this.leftPos + 102, this.topPos + 6, 24, 24, 0, 0, 24, new ResourceLocation("rpg_classes:textures/screens/atlas/imagebutton_archer_button.png"), 24, 48, e -> {
			if (true) {
				RpgClassesMod.PACKET_HANDLER.sendToServer(new ClassChooseGUIButtonMessage(2, x, y, z));
				ClassChooseGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_archer_button", imagebutton_archer_button);
		this.addRenderableWidget(imagebutton_archer_button);
		imagebutton_rogue = new ImageButton(this.leftPos + 165, this.topPos + 6, 24, 24, 0, 0, 24, new ResourceLocation("rpg_classes:textures/screens/atlas/imagebutton_rogue.png"), 24, 48, e -> {
			if (true) {
				RpgClassesMod.PACKET_HANDLER.sendToServer(new ClassChooseGUIButtonMessage(3, x, y, z));
				ClassChooseGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rogue", imagebutton_rogue);
		this.addRenderableWidget(imagebutton_rogue);
		imagebutton_wich_button = new ImageButton(this.leftPos + 228, this.topPos + 6, 24, 24, 0, 0, 24, new ResourceLocation("rpg_classes:textures/screens/atlas/imagebutton_wich_button.png"), 24, 48, e -> {
			if (true) {
				RpgClassesMod.PACKET_HANDLER.sendToServer(new ClassChooseGUIButtonMessage(4, x, y, z));
				ClassChooseGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_wich_button", imagebutton_wich_button);
		this.addRenderableWidget(imagebutton_wich_button);
		imagebutton_warlock_button = new ImageButton(this.leftPos + 291, this.topPos + 6, 24, 24, 0, 0, 24, new ResourceLocation("rpg_classes:textures/screens/atlas/imagebutton_warlock_button.png"), 24, 48, e -> {
			if (true) {
				RpgClassesMod.PACKET_HANDLER.sendToServer(new ClassChooseGUIButtonMessage(5, x, y, z));
				ClassChooseGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_warlock_button", imagebutton_warlock_button);
		this.addRenderableWidget(imagebutton_warlock_button);
		imagebutton_blacksmith_button = new ImageButton(this.leftPos + 354, this.topPos + 6, 24, 24, 0, 0, 24, new ResourceLocation("rpg_classes:textures/screens/atlas/imagebutton_blacksmith_button.png"), 24, 48, e -> {
			if (true) {
				RpgClassesMod.PACKET_HANDLER.sendToServer(new ClassChooseGUIButtonMessage(6, x, y, z));
				ClassChooseGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_blacksmith_button", imagebutton_blacksmith_button);
		this.addRenderableWidget(imagebutton_blacksmith_button);
	}
}
