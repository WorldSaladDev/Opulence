package io.github.worldsaladdev.wsopulence.initialization;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = io.github.worldsaladdev.wsopulence.Opulence.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabInitialization {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, io.github.worldsaladdev.wsopulence.Opulence.MODID);

    public static final RegistryObject<CreativeModeTab> OPULENCE_TAB = CREATIVE_TAB.register("opulence_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.wsopulence.opulence_tab"))
                    .icon(() -> new ItemStack(BlockInitialization.OAK_TABLE.get()))
                    .displayItems((displayParameters, entries) -> ItemInitialization.ITEMS.getEntries().stream().map(RegistryObject::get).forEachOrdered(entries::accept))
                    .build());

    public static void register(IEventBus eventBus) {CREATIVE_TAB.register(eventBus);}
}
