package com.futurepresentpast.futurepresentpastmod;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModCreativeTabs {


    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(
                    Registries.CREATIVE_MODE_TAB,
                    Futurepresentpast.MODID
            );



    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FUTURE_TAB =
            CREATIVE_TABS.register(
                    "future_tab",
                    () -> CreativeModeTab.builder()

                            .title(
                                    Component.literal(
                                            "Future Present Past"
                                    )
                            )

                            .icon(
                                    () -> ModItems.THE_CLOCK_OF_TIME
                                            .get()
                                            .getDefaultInstance()
                            )

                            .withTabsBefore(
                                    CreativeModeTabs.COMBAT
                            )

                            .displayItems(
                                    (parameters, output) -> {

                                        output.accept(
                                                ModItems.THE_CLOCK_OF_TIME.get()
                                        );

                                        output.accept(
                                                ModBlocks.RUBY_BLOCK_ITEM.get()
                                        );

                                    }
                            )

                            .build()
            );



    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}