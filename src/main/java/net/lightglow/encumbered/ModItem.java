package net.lightglow.encumbered;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
    public static final Item ENCUMBERING_STONE = register(
            new EncumberingStoneItem(new Item.Settings()),
            "encumbering_stone"
    );

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = new Identifier(Encumbered.MOD_ID, id);

        // Return the registered item!
        return Registry.register(Registries.ITEM, itemID, item);
    }
    public static void initialize() {
    }
}
