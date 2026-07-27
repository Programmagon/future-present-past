package com.futurepresentpast.futurepresentpastmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Zentrales Register für alle Items dieses Mods
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, Futurepresentpast.MODID);

    // Unser Test-Item
    public static final DeferredHolder<Item, Item> TEST_ITEM = ITEMS.register(
            "test_item",
            () -> new Item(new Item.Properties())
    );

    // Diese Methode wird einmal beim Modstart aufgerufen
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}