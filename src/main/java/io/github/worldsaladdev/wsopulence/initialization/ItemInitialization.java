package io.github.worldsaladdev.wsopulence.initialization;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitialization {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, io.github.worldsaladdev.wsopulence.Opulence.MODID);

    public static final RegistryObject<Item> WROUGHT_IRON_INGOT = ITEMS.register("wrought_iron_ingot",
            () -> new Item(new Item.Properties().stacksTo(64)));

}


