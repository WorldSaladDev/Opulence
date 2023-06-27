package io.github.worldsaladdev.wsopulence.initialization;

import io.github.worldsaladdev.wsopulence.Opulence;
import io.github.worldsaladdev.wsopulence.blocks.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BlockInitialization {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Opulence.MODID);

    //Blocks
    public static final RegistryObject<Block> WHITE_CONCRETE_BRICKS = register("white_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_BRICKS = register("light_gray_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> GRAY_CONCRETE_BRICKS = register("gray_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> BLACK_CONCRETE_BRICKS = register("black_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> BROWN_CONCRETE_BRICKS = register("brown_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> RED_CONCRETE_BRICKS = register("red_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> ORANGE_CONCRETE_BRICKS = register("orange_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> YELLOW_CONCRETE_BRICKS = register("yellow_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> LIME_CONCRETE_BRICKS = register("lime_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> GREEN_CONCRETE_BRICKS = register("green_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> CYAN_CONCRETE_BRICKS = register("cyan_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_BRICKS = register("light_blue_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> BLUE_CONCRETE_BRICKS = register("blue_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> PURPLE_CONCRETE_BRICKS = register("purple_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> MAGENTA_CONCRETE_BRICKS = register("magenta_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), new Item.Properties());

    public static final RegistryObject<Block> PINK_CONCRETE_BRICKS = register("pink_concrete_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), new Item.Properties());

//Building Blocks
    public static final RegistryObject<Block> PORCELAIN_BRICKS = register("porcelain_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_BRICK_STAIRS = register("porcelain_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_BRICK_SLAB = register("porcelain_brick_stairs",
            () -> new StairBlock(PORCELAIN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_BRICK_WALL = register("porcelain_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_TILES = register("porcelain_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> IRON_FENCE = register("iron_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> IRON_FENCE_GATE = register("iron_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), WoodType.OAK), new Item.Properties());


//Tables
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

    public static final RegistryObject<Block> GLASS_TABLE = register("glass_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> IRON_TABLE = register("iron_table",
            () -> new TableBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

//Chairs
    public static final RegistryObject<Block> OAK_CHAIR = register("oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> SPRUCE_CHAIR = register("spruce_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> BIRCH_CHAIR = register("birch_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> JUNGLE_CHAIR = register("jungle_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> ACACIA_CHAIR = register("acacia_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> DARK_OAK_CHAIR = register("dark_oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> MANGROVE_CHAIR = register("mangrove_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> CHERRY_CHAIR = register("cherry_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> BAMBOO_CHAIR = register("bamboo_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> CRIMSON_CHAIR = register("crimson_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> WARPED_CHAIR = register("warped_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> GLASS_CHAIR = register("glass_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> IRON_CHAIR = register("iron_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

//Dishes
    public static final RegistryObject<Block> IRON_CUP = register("iron_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> BAMBOO_CUP = register("bamboo_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> CERAMIC_CUP = register("ceramic_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> GLASS_CUP = register("glass_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> WHITE_PLATE = register("white_plate",
            () -> new PlateBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());


//Other Furniture
    public static final RegistryObject<Block> TELESCOPE = register("telescope",
            () -> new TelescopeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

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