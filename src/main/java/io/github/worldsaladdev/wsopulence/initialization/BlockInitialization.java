package io.github.worldsaladdev.wsopulence.initialization;

import io.github.worldsaladdev.wsopulence.Opulence;
import io.github.worldsaladdev.wsopulence.blocks.CupBlock;
import io.github.worldsaladdev.wsopulence.blocks.TableBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BlockInitialization {

//Tables
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Opulence.MODID);

    public static final RegistryObject<Block> OAK_TABLE = register("oak_table",
        () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> SPRUCE_TABLE = register("spruce_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> BIRCH_TABLE = register("birch_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> JUNGLE_TABLE = register("jungle_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> ACACIA_TABLE = register("acacia_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> DARK_OAK_TABLE = register("dark_oak_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> MANGROVE_TABLE = register("mangrove_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> CHERRY_TABLE = register("cherry_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> BAMBOO_TABLE = register("bamboo_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> CRIMSON_TABLE = register("crimson_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> WARPED_TABLE = register("warped_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

//Cups
    public static final RegistryObject<Block> IRON_CUP = register("iron_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> BAMBOO_CUP = register("bamboo_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> CERAMIC_CUP = register("ceramic_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> GLASS_CUP = register("glass_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    //mundane blockitem
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInitialization.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

    //fuel blockitem
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties, int blockItemBurnTime) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInitialization.ITEMS.register(name, () -> new BlockItem(block.get(), properties) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return blockItemBurnTime;
            }
        });
        return block;
    }
}