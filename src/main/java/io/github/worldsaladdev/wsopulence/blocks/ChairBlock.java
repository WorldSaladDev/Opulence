package io.github.worldsaladdev.wsopulence.blocks;


import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Function;

public class ChairBlock extends Block {

    private static final VoxelShape SHAPE_N = makeShapeN();
    private static final VoxelShape SHAPE_S = makeShapeS();
    private static final VoxelShape SHAPE_E = makeShapeE();
    private static final VoxelShape SHAPE_W = makeShapeW();
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public ChairBlock(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    //rotation
    public BlockState getStateForPlacement(BlockPlaceContext p_49573_) {
        return this.defaultBlockState().setValue(FACING, p_49573_.getHorizontalDirection());
    }

    @Override public BlockState rotate(BlockState blockState, net.minecraft.world.level.block.Rotation rotation) { return blockState.setValue(FACING, rotation.rotate(blockState.getValue(FACING))); }
    @Override public BlockState mirror(BlockState blockState, net.minecraft.world.level.block.Mirror mirror) { return blockState.rotate(mirror.getRotation(blockState.getValue(FACING))); }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_49646_) {
        p_49646_.add(FACING);
    }

    public RenderShape getRenderShape(BlockState p_49653_) {
        return RenderShape.MODEL;
    }

    //voxelshape
    public static VoxelShape makeShapeN(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.125, 0.625, 0.125, 0.875, 0.75, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.75, 0.75, 0.25, 1.5, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0.75, 0.75, 0.75, 1.5, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0.75, 0.75, 0.875, 1.5, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0.75, 0.875, 0.625, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.75, 0.25, 0.625, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.125, 0.25, 0.625, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0.125, 0.875, 0.625, 0.25), BooleanOp.OR);

        return shape;
    }

    public static VoxelShape makeShapeS(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.125, 0.625, 0.125, 0.875, 0.75, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0.75, 0.125, 0.875, 1.5, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0.75, 0.125, 0.75, 1.5, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.75, 0.125, 0.25, 1.5, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.125, 0.25, 0.625, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0.125, 0.875, 0.625, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0.75, 0.875, 0.625, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.75, 0.25, 0.625, 0.875), BooleanOp.OR);

        return shape;
    }

    public static VoxelShape makeShapeE(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.125, 0.625, 0.125, 0.875, 0.75, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.75, 0.125, 0.25, 1.5, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.75, 0.25, 0.25, 1.5, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.75, 0.75, 0.25, 1.5, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.75, 0.25, 0.625, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.125, 0.25, 0.625, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0.125, 0.875, 0.625, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0.75, 0.875, 0.625, 0.875), BooleanOp.OR);

        return shape;
    }

    public static VoxelShape makeShapeW(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.125, 0.625, 0.125, 0.875, 0.75, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0.75, 0.75, 0.875, 1.5, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0.75, 0.25, 0.875, 1.5, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0.75, 0.125, 0.875, 1.5, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0.125, 0.875, 0.625, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0.75, 0.875, 0.625, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.75, 0.25, 0.625, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.125, 0.25, 0.625, 0.25), BooleanOp.OR);

        return shape;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        if (state.getValue(FACING).equals(Direction.EAST))
            return SHAPE_E;
        else if (state.getValue(FACING).equals(Direction.SOUTH))
            return SHAPE_S;
        else if (state.getValue(FACING).equals(Direction.WEST))
            return SHAPE_W;
        else
            return SHAPE_N;
    }

    @Override
    protected ImmutableMap<BlockState, VoxelShape> getShapeForEachState(Function<BlockState, VoxelShape> p_152459_) {
        return super.getShapeForEachState(p_152459_);
    }
}
