package io.github.worldsaladdev.wsopulence.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

/***********************
 * The iron fence has weird behaviors regarding the post placement in certain configurations.
 * Also, placing certain blocks above an iron fence (like fence gates) causes a crash.
 *
 * The iron fence will use the normal fence block type until this is fixed
 ***********************/

public class IronFenceBlock extends FenceBlock {
    public static final BooleanProperty UP = BlockStateProperties.UP;


    public IronFenceBlock(Properties p_53302_) {
        super(p_53302_);
        this.registerDefaultState(this.stateDefinition.any().setValue(UP, Boolean.valueOf(false)).setValue(NORTH, Boolean.valueOf(false)).setValue(EAST, Boolean.valueOf(false)).setValue(SOUTH, Boolean.valueOf(false)).setValue(WEST, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_58032_) {
        p_58032_.add(UP, NORTH, EAST, WEST, SOUTH, WATERLOGGED);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockGetter blockgetter = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        BlockPos blockpos1 = blockpos.north();
        BlockPos blockpos2 = blockpos.east();
        BlockPos blockpos3 = blockpos.south();
        BlockPos blockpos4 = blockpos.west();
        BlockPos blockpos5 = blockpos.above();
        BlockState blockstate = blockgetter.getBlockState(blockpos1);
        BlockState blockstate1 = blockgetter.getBlockState(blockpos2);
        BlockState blockstate2 = blockgetter.getBlockState(blockpos3);
        BlockState blockstate3 = blockgetter.getBlockState(blockpos4);
        BlockState blockstate4 = blockgetter.getBlockState(blockpos5);
        return super.getStateForPlacement(context).setValue(UP, Boolean.valueOf(this.connectsTo(blockstate4, blockstate4.isFaceSturdy(blockgetter, blockpos5, Direction.DOWN), Direction.DOWN))).setValue(NORTH, Boolean.valueOf(this.connectsTo(blockstate, blockstate.isFaceSturdy(blockgetter, blockpos1, Direction.SOUTH), Direction.SOUTH))).setValue(EAST, Boolean.valueOf(this.connectsTo(blockstate1, blockstate1.isFaceSturdy(blockgetter, blockpos2, Direction.WEST), Direction.WEST))).setValue(SOUTH, Boolean.valueOf(this.connectsTo(blockstate2, blockstate2.isFaceSturdy(blockgetter, blockpos3, Direction.NORTH), Direction.NORTH))).setValue(WEST, Boolean.valueOf(this.connectsTo(blockstate3, blockstate3.isFaceSturdy(blockgetter, blockpos4, Direction.EAST), Direction.EAST))).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
    }

    public BlockState updateShape(BlockState state1, Direction direction, BlockState state, LevelAccessor level, BlockPos pos1, BlockPos pos2) {
        if (state1.getValue(WATERLOGGED)) {
            level.scheduleTick(pos1, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return direction.getAxis().getPlane() == Direction.Plane.HORIZONTAL ? state1.setValue(PROPERTY_BY_DIRECTION.get(direction), Boolean.valueOf(this.connectsTo(state, state.isFaceSturdy(level, pos2, direction.getOpposite()), direction.getOpposite()))) : super.updateShape(state1, direction, state, level, pos1, pos2).setValue(UP, Boolean.valueOf(this.connectsTo(state, state.isFaceSturdy(level, pos2, Direction.DOWN), Direction.DOWN)));
    }

}
