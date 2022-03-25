package com.shyukahn.mccourse.enchantment

import com.shyukahn.mccourse.MCCourse
import net.minecraft.enchantment.Enchantment
import net.minecraft.enchantment.EnchantmentTarget
import net.minecraft.entity.EquipmentSlot
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModEnchantments {

    val LIGHTNING_STRIKER = register("lightning_striker",
        LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND))

    private fun register(name: String, enchantment: Enchantment): Enchantment {
        return Registry.register(Registry.ENCHANTMENT, Identifier(MCCourse.MOD_ID, name), enchantment)
    }

    fun registerModEnchantments() {
        println("Registering ModEnchantments for ${MCCourse.MOD_ID}")
    }
}