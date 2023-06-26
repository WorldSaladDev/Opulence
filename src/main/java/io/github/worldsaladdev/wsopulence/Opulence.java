package io.github.worldsaladdev.wsopulence;

import io.github.worldsaladdev.wsopulence.initialization.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(io.github.worldsaladdev.wsopulence.Opulence.MODID)
public class Opulence {
    public static final String MODID = "wsopulence";

    public Opulence() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInitialization.BLOCKS.register(bus);
        ItemInitialization.ITEMS.register(bus);
        CreativeTabInitialization.CREATIVE_TAB.register(bus);
        PaintingInitialization.PAINTING_VARIANTS.register(bus);

    }
}