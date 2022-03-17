package com.shyukahn.mccourse.item

import com.shyukahn.mccourse.MCCourse
import com.shyukahn.mccourse.item.custom.DowsingRodItem
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModItems {

    val ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
        Item(FabricItemSettings().group(ModItemGroups.COURSE)))

    val ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
        Item(FabricItemSettings().group(ModItemGroups.COURSE)))

    val RAW_ORICHALCUM = registerItem("raw_orichalcum",
        Item(FabricItemSettings().group(ModItemGroups.COURSE)))

    val DOWSING_ROD = registerItem("dowsing_rod",
        DowsingRodItem(FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)))

    val TURNIP = registerItem("turnip",
        Item(FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.TURNIP)))

    val COAL_SLIVER = registerItem("coal_sliver",
        Item(FabricItemSettings().group(ModItemGroups.COURSE)))

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registry.ITEM, Identifier(MCCourse.MOD_ID, name), item)
    }

    fun registerModItems() {
        println("Registering Mod Items for ${MCCourse.MOD_ID}")
    }
}