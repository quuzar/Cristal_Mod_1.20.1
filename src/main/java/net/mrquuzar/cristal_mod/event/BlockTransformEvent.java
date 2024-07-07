package net.mrquuzar.cristal_mod.event;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mrquuzar.cristal_mod.CristalMod;
import net.mrquuzar.cristal_mod.block.ModBlocks;

@Mod.EventBusSubscriber(modid = CristalMod.MOD_ID)
public class BlockTransformEvent {

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (!(event.getLevel() instanceof ServerLevel level)) return;
        BlockPos pos = event.getPos();
        ItemStack stack = event.getItemStack();

        if (level.getBlockState(pos).is(Blocks.DIAMOND_BLOCK) && stack.getItem() == Items.EMERALD) {
            // Преобразование алмазного блока в сапфировый блок
            level.setBlock(pos, ModBlocks.SAPPHIRE_BLOCK.get().defaultBlockState(), 3);
            // Уменьшение количества изумрудов на один
            if (!event.getEntity().isCreative()) {
                stack.shrink(1);
            }
            event.setCancellationResult(InteractionResult.SUCCESS);
            event.setCanceled(true);
        }
    }
}