package io.github.worldsaladdev.wsopulence.initialization;

import io.github.worldsaladdev.wsopulence.Opulence;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PaintingInitialization {

    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Opulence.MODID);

    public static final RegistryObject<PaintingVariant> VAPORWAVE_SUN = PAINTING_VARIANTS.register("vaporwave_sun", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> VAPORWAVE_TREE = PAINTING_VARIANTS.register("vaporwave_tree", () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> VAPORWAVE_TRIANGLES = PAINTING_VARIANTS.register("vaporwave_triangles", () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> VAPORWAVE_MOUNTAIN = PAINTING_VARIANTS.register("vaporwave_mountain", () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> VAPORWAVE_BUST = PAINTING_VARIANTS.register("vaporwave_bust", () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> VAPORWAVE_CUBE = PAINTING_VARIANTS.register("vaporwave_cube", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ABSTRACT_SQUARES = PAINTING_VARIANTS.register("abstract_squares", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ABSTRACT_BLOB = PAINTING_VARIANTS.register("abstract_blob", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ABSTRACT_PATH = PAINTING_VARIANTS.register("abstract_path", () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> ABSTRACT_SPLATTER = PAINTING_VARIANTS.register("abstract_splatter", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> ZDZISLAW = PAINTING_VARIANTS.register("zdzislaw", () -> new PaintingVariant(16, 32));
}
