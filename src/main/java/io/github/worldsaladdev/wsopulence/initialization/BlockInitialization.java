package io.github.worldsaladdev.wsopulence.initialization;

import io.github.worldsaladdev.wsopulence.Opulence;
import io.github.worldsaladdev.wsopulence.blocks.*;
import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class BlockInitialization {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Opulence.MODID);

//Building blocks

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

    public static final RegistryObject<Block> BRICK_TILES = register("brick_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)), new Item.Properties());

    public static final RegistryObject<Block> LAVA_LANTERN = register("lava_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).mapColor(DyeColor.ORANGE)), new Item.Properties());

    public static final RegistryObject<Block> COBBLEBONES = register("cobblebones",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> COBBLEBONE_SLAB = register("cobblebone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> COBBLEBONE_STAIRS = register("cobblebone_stairs",
            () -> new StairBlock(COBBLEBONES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> COBBLEBONE_WALL = register("cobblebone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> COBBLEBONE_BRICKS = register("cobblebone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> COBBLEBONE_BRICK_SLAB = register("cobblebone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> COBBLEBONE_BRICK_STAIRS = register("cobblebone_brick_stairs",
            () -> new StairBlock(COBBLEBONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> COBBLEBONE_BRICK_WALL = register("cobblebone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> CALCITE_BRICKS = register("calcite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)), new Item.Properties());

    public static final RegistryObject<Block> CALCITE_BRICK_SLAB = register("calcite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), new Item.Properties());

    public static final RegistryObject<Block> CALCITE_BRICK_STAIRS = register("calcite_brick_stairs",
            () -> new StairBlock(CALCITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)), new Item.Properties());

    public static final RegistryObject<Block> CALCITE_BRICK_WALL = register("calcite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), new Item.Properties());

    public static final RegistryObject<Block> TUFF_BRICKS = register("tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)), new Item.Properties());

    public static final RegistryObject<Block> TUFF_BRICK_SLAB = register("tuff_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), new Item.Properties());

    public static final RegistryObject<Block> TUFF_BRICK_STAIRS = register("tuff_brick_stairs",
            () -> new StairBlock(TUFF_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)), new Item.Properties());

    public static final RegistryObject<Block> TUFF_BRICK_WALL = register("tuff_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), new Item.Properties());

    public static final RegistryObject<Block> LARGE_AMETHYST_BRICKS = register("large_amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> LARGE_AMETHYST_BRICK_STAIRS = register("large_amethyst_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> LARGE_AMETHYST_BRICK_SLAB = register("large_amethyst_brick_stairs",
            () -> new StairBlock(LARGE_AMETHYST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> LARGE_AMETHYST_BRICK_WALL = register("large_amethyst_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> SMALL_AMETHYST_BRICKS = register("small_amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> SMALL_AMETHYST_BRICK_STAIRS = register("small_amethyst_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> SMALL_AMETHYST_BRICK_SLAB = register("small_amethyst_brick_stairs",
            () -> new StairBlock(SMALL_AMETHYST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> SMALL_AMETHYST_BRICK_WALL = register("small_amethyst_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_BRICKS = register("porcelain_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_TILES = register("porcelain_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_BRICK_STAIRS = register("porcelain_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_BRICK_SLAB = register("porcelain_brick_stairs",
            () -> new StairBlock(PORCELAIN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> PORCELAIN_BRICK_WALL = register("porcelain_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_BLUE)), new Item.Properties());

    public static final RegistryObject<Block> SHADOW_BRICKS = register("shadow_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY)), new Item.Properties());

    public static final RegistryObject<Block> SHADOW_TILES = register("shadow_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY)), new Item.Properties());

    public static final RegistryObject<Block> SHADOW_BRICK_STAIRS = register("shadow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB).mapColor(DyeColor.GRAY)), new Item.Properties());

    public static final RegistryObject<Block> SHADOW_BRICK_SLAB = register("shadow_brick_stairs",
            () -> new StairBlock(SHADOW_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICK_STAIRS).mapColor(DyeColor.GRAY)), new Item.Properties());

    public static final RegistryObject<Block> SHADOW_BRICK_WALL = register("shadow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GRAY)), new Item.Properties());

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

//Other Furniture
    public static final RegistryObject<Block> IRON_CUP = register("iron_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> BAMBOO_CUP = register("bamboo_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> CERAMIC_CUP = register("ceramic_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> GLASS_CUP = register("glass_cup",
            () -> new CupBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> TELESCOPE = register("telescope",
            () -> new TelescopeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).pushReaction(PushReaction.DESTROY).ignitedByLava().dynamicShape().noOcclusion()), new Item.Properties(), 300);

    public static final RegistryObject<Block> PLAINS_VILLAGER_STATUE = register("plains_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.plains_villager_statue.description");

    public static final RegistryObject<Block> DESERT_VILLAGER_STATUE = register("desert_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.desert_villager_statue.description");

    public static final RegistryObject<Block> JUNGLE_VILLAGER_STATUE = register("jungle_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.jungle_villager_statue.description");

    public static final RegistryObject<Block> SWAMP_VILLAGER_STATUE = register("swamp_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.swamp_villager_statue.description");

    public static final RegistryObject<Block> TAIGA_VILLAGER_STATUE = register("taiga_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.taiga_villager_statue.description");

    public static final RegistryObject<Block> SNOW_VILLAGER_STATUE = register("snow_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.snow_villager_statue.description");

    public static final RegistryObject<Block> SAVANNA_VILLAGER_STATUE = register("savanna_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.savanna_villager_statue.description");

    public static final RegistryObject<Block> HOBART_VILLAGER_STATUE = register("hobart_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.hobart_villager_statue.description");

    public static final RegistryObject<Block> ZOMBIE_VILLAGER_STATUE = register("zombie_villager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.ZOMBIE_VILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.zombie_villager_statue.description");

    public static final RegistryObject<Block> PILLAGER_STATUE = register("pillager_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.PILLAGER_AMBIENT), new Item.Properties(), "block.wsopulence.pillager_statue.description");

    public static final RegistryObject<Block> VINDICATOR_STATUE = register("vindicator_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.VINDICATOR_AMBIENT), new Item.Properties(), "block.wsopulence.vindicator_statue.description");

    public static final RegistryObject<Block> EVOKER_STATUE = register("evoker_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.EVOKER_AMBIENT), new Item.Properties(), "block.wsopulence.evoker_statue.description");

    public static final RegistryObject<Block> WITCH_STATUE = register("witch_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.WITCH_AMBIENT), new Item.Properties(), "block.wsopulence.witch_statue.description");

    public static final RegistryObject<Block> WANDERING_TRADER_STATUE = register("wandering_trader_statue",
            () -> new MobStatueBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).pushReaction(PushReaction.DESTROY).dynamicShape().noOcclusion(), SoundEvents.WANDERING_TRADER_AMBIENT), new Item.Properties(), "block.wsopulence.wandering_trader_statue.description");

    public static final RegistryObject<Block> BLANK_BUST = register("blank_bust",
            () -> new BustBlock(BlockBehaviour.Properties.copy(Blocks.STONE).dynamicShape().noOcclusion()), new Item.Properties(), "block.wsopulence.blank_bust.description");

    public static final RegistryObject<Block> STEVE_BUST = register("steve_bust",
            () -> new BustBlock(BlockBehaviour.Properties.copy(Blocks.STONE).dynamicShape().noOcclusion()), new Item.Properties(), "block.wsopulence.steve_bust.description");

    public static final RegistryObject<Block> ALEX_BUST = register("alex_bust",
            () -> new BustBlock(BlockBehaviour.Properties.copy(Blocks.STONE).dynamicShape().noOcclusion()), new Item.Properties(), "block.wsopulence.alex_bust.description");

    public static final RegistryObject<Block> CHANDELIER = register("chandelier",
            () -> new ChandelierBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> CANDELABRA = register("candelabra",
            () -> new CandelabraBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> MEDIUM_POT = register("medium_pot",
            () -> new MediumPotBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> SHORT_POT = register("short_pot",
            () -> new ShortPotBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).dynamicShape().noOcclusion()), new Item.Properties());

    public static final RegistryObject<Block> TALL_POT = register("tall_pot",
            () -> new TallPotBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).dynamicShape().noOcclusion()), new Item.Properties());

    //mundane blockitem
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInitialization.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

    //mob statue blockitem
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties, String tooltipTranslationKey) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInitialization.ITEMS.register(name, () -> new BlockItem(block.get(), properties) {
            @Override
            public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> component, TooltipFlag flag) {
                component.add(Component.translatable(tooltipTranslationKey).withStyle(ChatFormatting.GRAY));
            }
        });
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