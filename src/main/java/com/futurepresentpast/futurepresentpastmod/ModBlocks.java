package com.futurepresentpast.futurepresentpastmod;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
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


            public static final DeferredBlock<Block> the_table_of_time =
            BLOCKS.registerSimpleBlock(
                    "the_table_of_time",
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
            );

    public static final DeferredItem<BlockItem> the_table_of_time_ITEM =
            ITEMS.registerSimpleBlockItem("the_table_of_time", the_table_of_time);






    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);

    }
}