
package net.mcreator.rpgclasses.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class IronDaggerItem extends SwordItem {
	public IronDaggerItem() {
		super(new Tier() {
			public int getUses() {
				return 150;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return -0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1f, new Item.Properties());
	}
}
