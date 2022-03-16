package com.shyukahn.mccourse.item.custom

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemUsageContext
import net.minecraft.text.LiteralText
import net.minecraft.text.TranslatableText
import net.minecraft.util.ActionResult
import net.minecraft.util.math.BlockPos

class DowsingRodItem(settings: Settings) : Item(settings) {

    override fun useOnBlock(context: ItemUsageContext): ActionResult {
        if (context.world.isClient()) {
            val positionClicked: BlockPos = context.blockPos
            val player: PlayerEntity? = context.player
            var foundBlock = false

            for (i in 0..positionClicked.y + 64) {
                val blockBelow: Block = context.world.getBlockState(positionClicked.down(i)).block
                if (isValuableBlock(blockBelow)) {
                    outputValuableCoordinates(player, blockBelow, positionClicked.down(i))
                    foundBlock = true
                    break
                }
            }

            if (!foundBlock) {
                player?.sendMessage(TranslatableText("item.mccourse.dowsing_rod.no_valuables"), false)
            }
        }

        context.stack.damage(1, context.player) { it?.sendToolBreakStatus(it.activeHand) }

        return super.useOnBlock(context)
    }

    private fun outputValuableCoordinates(
        player: PlayerEntity?,
        blockBelow: Block,
        blockPos: BlockPos
    ) {
        player?.sendMessage(
            LiteralText(
                "Found ${blockBelow.asItem().name.string} at (${blockPos.x}, ${blockPos.y}, ${blockPos.z})"),
            false
        )
    }

    private fun isValuableBlock(block: Block): Boolean {
        return block in setOf<Block>(Blocks.COAL_ORE, Blocks.COPPER_ORE, Blocks.DIAMOND_ORE, Blocks.IRON_ORE)
    }
}