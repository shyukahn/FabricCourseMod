package com.shyukahn.mccourse.item

import com.shyukahn.mccourse.MCCourse
import com.shyukahn.mccourse.item.custom.DowsingRodItem
import com.shyukahn.mccourse.item.custom.ModAxeItem
import com.shyukahn.mccourse.item.custom.ModHoeItem
import com.shyukahn.mccourse.item.custom.ModPickaxeItem
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ShovelItem
import net.minecraft.item.SwordItem
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

    val ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
        ModPickaxeItem(ModToolMaterial.ORICHALCUM, 1, -2.8f,
            FabricItemSettings().group(ModItemGroups.COURSE)))

    val ORICHALCUM_AXE = registerItem("orichalcum_axe",
        ModAxeItem(ModToolMaterial.ORICHALCUM, 6.0f, -3.1f,
            FabricItemSettings().group(ModItemGroups.COURSE)))

    val ORICHALCUM_HOE = registerItem("orichalcum_hoe",
        ModHoeItem(ModToolMaterial.ORICHALCUM, -2, -1.0f,
            FabricItemSettings().group(ModItemGroups.COURSE)))

    val ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel",
        ShovelItem(ModToolMaterial.ORICHALCUM, 1.5f, -3.0f,
            FabricItemSettings().group(ModItemGroups.COURSE)))

    val ORICHALCUM_SWORD = registerItem("orichalcum_sword",
        SwordItem(ModToolMaterial.ORICHALCUM, 3, -2.4f,
            FabricItemSettings().group(ModItemGroups.COURSE)))

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registry.ITEM, Identifier(MCCourse.MOD_ID, name), item)
    }

    fun registerModItems() {
        println("Registering Mod Items for ${MCCourse.MOD_ID}")
    }
}