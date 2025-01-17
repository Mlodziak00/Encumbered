package net.lightglow.encumbered.mixin;

import net.lightglow.encumbered.ItemEncumberedInventoryGetter;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Iterator;
import java.util.List;

@Mixin(PlayerInventory.class)
public class PlayerInventoryMixin implements ItemEncumberedInventoryGetter {
    @Shadow @Final private List<DefaultedList<ItemStack>> combinedInventory;


    @Override
    public boolean containsEncumbered(TagKey<Item> tag) {
        Iterator var2 = this.combinedInventory.iterator();

        while(var2.hasNext()) {
            List<ItemStack> list = (List)var2.next();
            Iterator var4 = list.iterator();

            while(var4.hasNext()) {
                ItemStack itemStack = (ItemStack)var4.next();
                if (!itemStack.isEmpty() && itemStack.isIn(tag) && itemStack.getNbt().getBoolean("encubering")) {
                    return true;
                }
            }
        }

        return false;
    }
}
