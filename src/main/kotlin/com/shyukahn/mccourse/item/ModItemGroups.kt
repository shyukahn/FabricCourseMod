package com.shyukahn.mccourse.item

import com.shyukahn.mccourse.MCCourse
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object ModItemGroups {
    val COURSE: ItemGroup = FabricItemGroupBuilder.build(Identifier(MCCourse.MOD_ID, "course")) { ItemStack(ModItems.ORICHALCUM_INGOT) }
}