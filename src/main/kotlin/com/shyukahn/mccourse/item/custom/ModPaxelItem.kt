package com.shyukahn.mccourse.item.custom

import com.shyukahn.mccourse.util.ModTags
import net.minecraft.item.MiningToolItem
import net.minecraft.item.ToolMaterial

class ModPaxelItem(
    material: ToolMaterial,
    attackDamage: Float,
    attackSpeed: Float,
    settings: Settings?
) : MiningToolItem(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL_MINEABLE, settings)