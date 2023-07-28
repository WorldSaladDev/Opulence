package io.github.worldsaladdev.wsopulence.blocks;


import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Function;

public class ChandelierBlock extends LanternBlock {
    private static final VoxelShape SHAPE_FLOOR = makeShapeFloor();
    private static final VoxelShape SHAPE_CEILING = makeShapeCeiling();

    public ChandelierBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public RenderShape getRenderShape(BlockState p_49653_) {
        return RenderShape.MODEL;
    }

    //voxelshape
    public static VoxelShape makeShapeFloor(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.5625, 0.375, 0.4375, 0.9375, 0.5, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.375, 0.4375, 0.4375, 0.5, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.375, 0.5625, 0.5625, 0.5, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.5, 0, 0.625, 0.5625, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.5, 0.375, 0.25, 0.5625, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0.5, 0.375, 1, 0.5625, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.5, 0.75, 0.625, 0.5625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.375, 0.0625, 0.5625, 0.5, 0.4375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.5625, 0.0625, 0.5625, 0.8125, 0.1875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.5625, 0.8125, 0.5625, 0.8125, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.5625, 0.4375, 0.1875, 0.8125, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0.5625, 0.4375, 0.9375, 0.8125, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.375, 0.625, 0.5625, 0.625), BooleanOp.OR);

        return shape;
    }

    public static VoxelShape makeShapeCeiling(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.0625, 0.4375, 0.5625, 1, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5625, 0.0625, 0.4375, 0.9375, 0.1875, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.0625, 0.4375, 0.4375, 0.1875, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.0625, 0.5625, 0.5625, 0.1875, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.1875, 0, 0.625, 0.25, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.1875, 0.375, 0.25, 0.25, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0.1875, 0.375, 1, 0.25, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.1875, 0.75, 0.625, 0.25, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.0625, 0.0625, 0.5625, 0.1875, 0.4375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.25, 0.0625, 0.5625, 0.5, 0.1875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.25, 0.8125, 0.5625, 0.5, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.25, 0.4375, 0.1875, 0.5, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0.25, 0.4375, 0.9375, 0.5, 0.5625), BooleanOp.OR);

        return shape;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        if (state.getValue(HANGING).equals(true))
            return SHAPE_CEILING;
        else
            return SHAPE_FLOOR;
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource randomSource) {
        //positioned at the center of the block
        double x = (double)pos.getX() + 0.5D;
        double y = (double)pos.getY() + 0.5D;
        double z = (double)pos.getZ() + 0.5D;


        if (state.getValue(HANGING).equals(true)) {
            level.addParticle(ParticleTypes.SMOKE, x - 0.375, y + 0.175D, z, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x - 0.375, y + 0.175D, z, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x + 0.375, y + 0.175D, z, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x + 0.375, y + 0.175D, z, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x, y + 0.175D, z - 0.375, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x, y + 0.175D, z - 0.375, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x, y + 0.175D, z + 0.375, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x, y + 0.175D, z + 0.375, 0.0D, 0.0D, 0.0D);
        }
        else {
            level.addParticle(ParticleTypes.SMOKE, x - 0.375, y + 0.475D, z, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x - 0.375, y + 0.475D, z, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x + 0.375, y + 0.475D, z, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x + 0.375, y + 0.475D, z, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x, y + 0.475D, z - 0.375, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x, y + 0.475D, z - 0.375, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x, y + 0.475D, z + 0.375, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x, y + 0.475D, z + 0.375, 0.0D, 0.0D, 0.0D);
        }
    }
}
