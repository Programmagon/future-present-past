package com.futurepresentpast.futurepresentpastmod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Futurepresentpast.MODID)
public class Futurepresentpast {

    public static final String MODID = "futurepresentpast";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Futurepresentpast(IEventBus modEventBus, ModContainer modContainer) {

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(
                ModConfig.Type.COMMON,
                Config.SPEC
        );
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Future Present Past gestartet!");
    }
}