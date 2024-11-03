
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpgclasses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.rpgclasses.item.SplinterPotionItemItem;
import net.mcreator.rpgclasses.item.Speed3Item;
import net.mcreator.rpgclasses.item.ScytheItem;
import net.mcreator.rpgclasses.item.PaladinarmorsetItem;
import net.mcreator.rpgclasses.item.PaladinArmorItem;
import net.mcreator.rpgclasses.item.IronShieldItem;
import net.mcreator.rpgclasses.item.IronPlateItem;
import net.mcreator.rpgclasses.item.IronDaggerItem;
import net.mcreator.rpgclasses.item.GitTestItem;
import net.mcreator.rpgclasses.item.DiamondchainmillItem;
import net.mcreator.rpgclasses.item.DiamondDaggerItem;
import net.mcreator.rpgclasses.item.DialmondHammerItem;
import net.mcreator.rpgclasses.item.ClassresetItem;
import net.mcreator.rpgclasses.item.BoneBasherItem;
import net.mcreator.rpgclasses.RpgClassesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RpgClassesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RpgClassesMod.MODID);
	public static final RegistryObject<Item> CLASS_TABLE = block(RpgClassesModBlocks.CLASS_TABLE);
	public static final RegistryObject<Item> TEST = block(RpgClassesModBlocks.TEST);
	public static final RegistryObject<Item> PALADIN_ARMOR_HELMET = REGISTRY.register("paladin_armor_helmet", () -> new PaladinArmorItem.Helmet());
	public static final RegistryObject<Item> PALADIN_ARMOR_CHESTPLATE = REGISTRY.register("paladin_armor_chestplate", () -> new PaladinArmorItem.Chestplate());
	public static final RegistryObject<Item> PALADIN_ARMOR_LEGGINGS = REGISTRY.register("paladin_armor_leggings", () -> new PaladinArmorItem.Leggings());
	public static final RegistryObject<Item> PALADIN_ARMOR_BOOTS = REGISTRY.register("paladin_armor_boots", () -> new PaladinArmorItem.Boots());
	public static final RegistryObject<Item> IRON_SHIELD = REGISTRY.register("iron_shield", () -> new IronShieldItem());
	public static final RegistryObject<Item> DIALMOND_HAMMER = REGISTRY.register("dialmond_hammer", () -> new DialmondHammerItem());
	public static final RegistryObject<Item> BONE_BASHER = REGISTRY.register("bone_basher", () -> new BoneBasherItem());
	public static final RegistryObject<Item> DIAMONDCHAINMILL_HELMET = REGISTRY.register("diamondchainmill_helmet", () -> new DiamondchainmillItem.Helmet());
	public static final RegistryObject<Item> DIAMONDCHAINMILL_CHESTPLATE = REGISTRY.register("diamondchainmill_chestplate", () -> new DiamondchainmillItem.Chestplate());
	public static final RegistryObject<Item> DIAMONDCHAINMILL_LEGGINGS = REGISTRY.register("diamondchainmill_leggings", () -> new DiamondchainmillItem.Leggings());
	public static final RegistryObject<Item> DIAMONDCHAINMILL_BOOTS = REGISTRY.register("diamondchainmill_boots", () -> new DiamondchainmillItem.Boots());
	public static final RegistryObject<PaladinarmorsetItem> PALADINARMORSET_HELMET = REGISTRY.register("paladinarmorset_helmet", () -> new PaladinarmorsetItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<PaladinarmorsetItem> PALADINARMORSET_CHESTPLATE = REGISTRY.register("paladinarmorset_chestplate", () -> new PaladinarmorsetItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<PaladinarmorsetItem> PALADINARMORSET_LEGGINGS = REGISTRY.register("paladinarmorset_leggings", () -> new PaladinarmorsetItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<PaladinarmorsetItem> PALADINARMORSET_BOOTS = REGISTRY.register("paladinarmorset_boots", () -> new PaladinarmorsetItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<Item> IRON_DAGGER = REGISTRY.register("iron_dagger", () -> new IronDaggerItem());
	public static final RegistryObject<Item> DIAMOND_DAGGER = REGISTRY.register("diamond_dagger", () -> new DiamondDaggerItem());
	public static final RegistryObject<Item> CLASSRESET = REGISTRY.register("classreset", () -> new ClassresetItem());
	public static final RegistryObject<Item> SLIME_BOSS_SPAWN_EGG = REGISTRY.register("slime_boss_spawn_egg", () -> new ForgeSpawnEggItem(RpgClassesModEntities.SLIME_BOSS, -16711936, -16738048, new Item.Properties()));
	public static final RegistryObject<Item> ADVANCED_BREWING_STAND = block(RpgClassesModBlocks.ADVANCED_BREWING_STAND);
	public static final RegistryObject<Item> SPLINTER_POTION_ITEM = REGISTRY.register("splinter_potion_item", () -> new SplinterPotionItemItem());
	public static final RegistryObject<Item> ADVANCED_ANVIL = block(RpgClassesModBlocks.ADVANCED_ANVIL);
	public static final RegistryObject<Item> IRON_PLATE = REGISTRY.register("iron_plate", () -> new IronPlateItem());
	public static final RegistryObject<Item> SPEED_3 = REGISTRY.register("speed_3", () -> new Speed3Item());
	public static final RegistryObject<Item> SKELETON_KING_SPAWN_EGG = REGISTRY.register("skeleton_king_spawn_egg", () -> new ForgeSpawnEggItem(RpgClassesModEntities.SKELETON_KING, -1, -256, new Item.Properties()));
	public static final RegistryObject<Item> SKELETONTEST_SPAWN_EGG = REGISTRY.register("skeletontest_spawn_egg", () -> new ForgeSpawnEggItem(RpgClassesModEntities.SKELETONTEST, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SCYTHE = REGISTRY.register("scythe", () -> new ScytheItem());
	public static final RegistryObject<Item> GIT_TEST = REGISTRY.register("git_test", () -> new GitTestItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(IRON_SHIELD.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
