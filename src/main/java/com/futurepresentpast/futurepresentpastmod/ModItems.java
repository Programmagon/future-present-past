package com.futurepresentpast.futurepresentpastmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    Registries.ITEM,
                    Futurepresentpast.MODID
            );


    public static final DeferredHolder<Item, Item> THE_CLOCK_OF_TIME =
            ITEMS.register(
                    "the_clock_of_time",
                    () -> new Item(
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .rarity(Rarity.EPIC)
                    )
            );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}