package com.futurepresentpast.futurepresentpastmod;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModBlocks {


    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(
                    Futurepresentpast.MODID
            );


    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(
                    Futurepresentpast.MODID
            );






    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);

    }
}