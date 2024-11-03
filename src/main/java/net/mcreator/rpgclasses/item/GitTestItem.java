
package net.mcreator.rpgclasses.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GitTestItem extends Item {
	public GitTestItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
