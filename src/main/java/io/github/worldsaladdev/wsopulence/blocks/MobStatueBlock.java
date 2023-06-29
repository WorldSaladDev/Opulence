package io.github.worldsaladdev.wsopulence.blocks;


import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Function;

public class MobStatueBlock extends Block {

    private static final VoxelShape SHAPE = makeShape();

    private SoundEvent sound;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public MobStatueBlock(Properties p_49795_, SoundEvent soundType) {
        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
        sound = soundType;
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        level.playSound(player, pos, sound, SoundSource.BLOCKS);
        return InteractionResult.sidedSuccess(level.isClientSide);
    }


    //rotation
    public BlockState getStateForPlacement(BlockPlaceContext p_49573_) {
        return this.defaultBlockState().setValue(FACING, p_49573_.getHorizontalDirection().getOpposite());
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
    public static VoxelShape makeShape(){
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.25, 0, 0.25, 0.75, 0.8125, 0.75), BooleanOp.OR);

        return shape;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        return SHAPE;
    }

    @Override
    protected ImmutableMap<BlockState, VoxelShape> getShapeForEachState(Function<BlockState, VoxelShape> p_152459_) {
        return super.getShapeForEachState(p_152459_);
    }
}
