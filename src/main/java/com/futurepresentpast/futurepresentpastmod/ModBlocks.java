package com.futurepresentpast.futurepresentpastmod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public static final DeferredBlock<Block> RUBY_BLOCK =
        BLOCKS.registerSimpleBlock(
                "ruby_block",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_RED)
                        .strength(5.0F, 6.0F)
                        .requiresCorrectToolForDrops()
        );

public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM =
        ITEMS.registerSimpleBlockItem("ruby_block", RUBY_BLOCK);
