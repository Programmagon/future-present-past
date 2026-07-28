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


    public static final DeferredBlock<Block> RUBY_BLOCK =
            BLOCKS.registerSimpleBlock(
                    "ruby_block",
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .strength(5.0F, 6.0F)
                            .requiresCorrectToolForDrops()
            );


    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem(
                    "ruby_block",
                    RUBY_BLOCK
            );


    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);

    }
}