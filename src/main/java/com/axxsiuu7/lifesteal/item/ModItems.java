package com.axxsiuu7.lifesteal.item;

import com.axxsiuu7.lifesteal.Axxsiuu7sCustomLifesteal;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Axxsiuu7sCustomLifesteal.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Axxsiuu7sCustomLifesteal.LOGGER.info("Registering Mod Items for " + Axxsiuu7sCustomLifesteal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
        });
    }

}