package io.github.worldsaladdev.wsopulence.blocks;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class CandelabraBlock extends Block {
    private static final VoxelShape SHAPE = makeShape();

    public CandelabraBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public RenderShape getRenderShape(BlockState p_49653_) {
        return RenderShape.MODEL;
    }

    //voxelshape
    public static VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.3125, 0.4375, 0.5625, 0.5625, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.0625, 0.4375, 0.5625, 0.3125, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5625, 0.375, 0.4375, 0.9375, 0.5, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.375, 0.4375, 0.4375, 0.5, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.375, 0.5625, 0.5625, 0.5, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.5, 0, 0.625, 0.5625, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.5, 0.375, 0.25, 0.5625, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0, 0.375, 0.625, 0.0625, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0.5, 0.375, 1, 0.5625, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.5, 0.75, 0.625, 0.5625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.375, 0.0625, 0.5625, 0.5, 0.4375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.5625, 0.0625, 0.5625, 0.8125, 0.1875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.5625, 0.8125, 0.5625, 0.8125, 0.9375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.0625, 0.5625, 0.4375, 0.1875, 0.8125, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0.5625, 0.4375, 0.9375, 0.8125, 0.5625), BooleanOp.OR);

        return shape;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
            return SHAPE;
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource randomSource) {
        //positioned at the center of the block
        double x = (double)pos.getX() + 0.5D;
        double y = (double)pos.getY() + 0.5D;
        double z = (double)pos.getZ() + 0.5D;
            level.addParticle(ParticleTypes.SMOKE, x - 0.375, y + 0.475D, z, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x - 0.375, y + 0.475D, z, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x + 0.375, y + 0.475D, z, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x + 0.375, y + 0.475D, z, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x, y + 0.475D, z - 0.375, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x, y + 0.475D, z - 0.375, 0.0D, 0.0D, 0.0D);

            level.addParticle(ParticleTypes.SMOKE, x, y + 0.475D, z + 0.375, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x, y + 0.475D, z + 0.375, 0.0D, 0.0D, 0.0D);
    }

    public boolean canSurvive(BlockState p_153479_, LevelReader p_153480_, BlockPos p_153481_) {
        return Block.canSupportCenter(p_153480_, p_153481_.relative(Direction.DOWN), Direction.DOWN.getOpposite());
    }

    public BlockState updateShape(BlockState p_49329_, Direction p_49330_, BlockState p_49331_, LevelAccessor p_49332_, BlockPos p_49333_, BlockPos p_49334_) {
        return p_49330_ == Direction.DOWN && !p_49329_.canSurvive(p_49332_, p_49333_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_49329_, p_49330_, p_49331_, p_49332_, p_49333_, p_49334_);
    }
}
