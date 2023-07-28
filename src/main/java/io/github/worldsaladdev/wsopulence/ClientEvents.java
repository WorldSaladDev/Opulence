package io.github.worldsaladdev.wsopulence;

import io.github.worldsaladdev.wsopulence.initialization.BlockInitialization;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Opulence.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInitialization.GLASS_CUP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInitialization.GLASS_TABLE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInitialization.GLASS_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInitialization.CHANDELIER.get(), RenderType.cutout());
    }
}