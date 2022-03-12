package com.shyukahn.mccourse.item

import com.shyukahn.mccourse.MCCourse
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModItems {

    val ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
        Item(FabricItemSettings().group(ItemGroup.MISC)))

    val ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
        Item(FabricItemSettings().group(ItemGroup.MISC)))

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registry.ITEM, Identifier(MCCourse.MOD_ID, name), item)
    }

    fun registerModItems() {
        println("Registering Mod Items for ${MCCourse.MOD_ID}")
    }
}