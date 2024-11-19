package net.lightglow.encumbered;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;

public interface ItemEncumberedInventoryGetter {

    default boolean containsEncumbered(TagKey<Item> tag){
        return false;
    }
}
