package com.shyukahn.mccourse.item

import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Lazy
import java.util.function.Supplier

enum class ModArmorMaterials(
    private val materialName: String,
    private val durabilityMultiplier: Int,
    private val protectionAmounts: Array<Int>,
    private val enchantability: Int,
    private val equipSound: SoundEvent,
    private val toughness: Float,
    private val knockbackResistance: Float,
    repairIngredientSupplier: Supplier<Ingredient>
    ) : ArmorMaterial {
    ORICHALCUM("orichalcum", 19, arrayOf(3, 5, 7, 2), 17,
        SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f, 0.0f,
        { Ingredient.ofItems(ModItems.ORICHALCUM_INGOT) } );

    private val repairIngredientSupplier: Lazy<Ingredient> = Lazy(repairIngredientSupplier)

    override fun getDurability(slot: EquipmentSlot): Int {
        return BASE_DURABILITY[slot.entitySlotId] * durabilityMultiplier
    }
    override fun getProtectionAmount(slot: EquipmentSlot) = protectionAmounts[slot.entitySlotId]
    override fun getEnchantability() = enchantability
    override fun getEquipSound() = equipSound
    override fun getRepairIngredient(): Ingredient = repairIngredientSupplier.get()
    override fun getName() = materialName
    override fun getToughness() = toughness
    override fun getKnockbackResistance() = knockbackResistance

    companion object {
        val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
    }
}