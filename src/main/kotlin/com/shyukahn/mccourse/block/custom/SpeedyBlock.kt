package com.shyukahn.mccourse.block.custom

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.text.LiteralText
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class SpeedyBlock(settings: Settings) : Block(settings) {

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        // Called 4 times on right click:
        // 2 times on the Server (for each hand)
        // 2 times on the Client (for each hand)
        if (world.isClient()) {
            if (hand == Hand.MAIN_HAND) {
                player.sendMessage(LiteralText("CLIENT: This is THE CLIENT! MAIN HAND!"), false)
            } else {
                player.sendMessage(LiteralText("CLIENT: This is THE CLIENT! OFF HAND!"), false)
            }
        }
        return ActionResult.PASS
    }

    override fun onSteppedOn(world: World, pos: BlockPos, state: BlockState, entity: Entity) {
        if (!world.isClient()) {
            if (entity is LivingEntity) {
                entity.addStatusEffect(StatusEffectInstance(StatusEffects.SPEED, 200))
            }
        }
        super.onSteppedOn(world, pos, state, entity)
    }
}