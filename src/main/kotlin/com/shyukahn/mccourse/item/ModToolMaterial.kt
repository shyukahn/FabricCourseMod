package com.shyukahn.mccourse.item

import net.fabricmc.yarn.constants.MiningLevels
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.util.Lazy
import java.util.function.Supplier

enum class ModToolMaterial(
    private val miningLevel: Int,
    private val itemDurability: Int,
    private val miningSpeed: Float,
    private val attackDamage: Float,
    private val enchantability: Int,
    repairIngredient: Supplier<Ingredient>
    ) : ToolMaterial {
    ORICHALCUM(MiningLevels.IRON, 750, 6.5f, 2.0f, 17,
        { Ingredient.ofItems(ModItems.ORICHALCUM_INGOT) });

    private val repairIngredient: Lazy<Ingredient> = Lazy(repairIngredient)

    override fun getMiningLevel() = miningLevel
    override fun getDurability() = itemDurability
    override fun getMiningSpeedMultiplier() = miningSpeed
    override fun getAttackDamage() = attackDamage
    override fun getEnchantability() = enchantability
    override fun getRepairIngredient(): Ingredient = repairIngredient.get()
}