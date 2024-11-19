package net.lightglow.encumbered;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> ENCUMBERING_STONE = createTag("encuberingstone");

    private static TagKey<Item> createTag(String name){
        return TagKey.of(RegistryKeys.ITEM, new Identifier(Encumbered.MOD_ID, name));
    }
}
