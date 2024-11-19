package net.lightglow.encumbered.mixin;

import net.lightglow.encumbered.Encumbered;
import net.lightglow.encumbered.EncumberingStoneItem;
import net.lightglow.encumbered.ModItem;
import net.lightglow.encumbered.ModItemTags;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.slot.Slot;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public abstract class ExampleMixin {

	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getCount()I"), method = "onPlayerCollision", cancellable = true)
	private void init(PlayerEntity player, CallbackInfo info) {
		if (player.getInventory().containsEncumbered(ModItemTags.ENCUMBERING_STONE)) {
			info.cancel();
		}
	}
}