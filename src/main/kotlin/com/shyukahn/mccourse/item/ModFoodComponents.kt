package com.shyukahn.mccourse.item

import net.minecraft.item.FoodComponent

object ModFoodComponents {
    val TURNIP: FoodComponent = FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()
}