package com.shyukahn.mccourse.util

import com.shyukahn.mccourse.MCCourse
import com.shyukahn.mccourse.item.ModItems
import net.fabricmc.fabric.api.registry.FuelRegistry

object ModRegistries {
    fun registerModStuffs() {
        registerFuels()
    }

    private fun registerFuels() {
        println("Registering Fuels for ${MCCourse.MOD_ID}")
        val registry: FuelRegistry = FuelRegistry.INSTANCE

        // 400 / 20 = 20 Seconds
        registry.add(ModItems.COAL_SLIVER, 400)
    }
}