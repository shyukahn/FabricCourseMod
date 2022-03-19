package com.shyukahn.mccourse.block

import com.shyukahn.mccourse.MCCourse
import com.shyukahn.mccourse.block.custom.ModPressurePlateBlock
import com.shyukahn.mccourse.block.custom.ModStairsBlock
import com.shyukahn.mccourse.block.custom.ModStoneButtonBlock
import com.shyukahn.mccourse.block.custom.SpeedyBlock
import com.shyukahn.mccourse.item.ModItemGroups
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.*
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModBlocks {

    val ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
        Block(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    val ORICHALCUM_ORE = registerBlock("orichalcum_ore",
        Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.COURSE)

    val DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
        Block(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool()), ModItemGroups.COURSE)

    val RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
        Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    val SPEEDY_BLOCK = registerBlock("speedy_block",
        SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroups.COURSE)

    val ORICHALCUM_STAIRS = registerBlock("orichalcum_stairs",
        ModStairsBlock(ORICHALCUM_BLOCK.defaultState,
            FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    val ORICHALCUM_SLAB = registerBlock("orichalcum_slab",
        SlabBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    val ORICHALCUM_BUTTON = registerBlock("orichalcum_button",
        ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    val ORICHALCUM_PRESSURE_PLATE = registerBlock("orichalcum_pressure_plate",
        ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    val ORICHALCUM_FENCE = registerBlock("orichalcum_fence",
        FenceBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    val ORICHALCUM_FENCE_GATE = registerBlock("orichalcum_fence_gate",
        FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    val ORICHALCUM_WALL = registerBlock("orichalcum_wall",
        WallBlock(FabricBlockSettings.of(Material.METAL).strength(6.0f).requiresTool()), ModItemGroups.COURSE)

    private fun registerBlock(name: String, block: Block, group: ItemGroup): Block {
        registerBlockItem(name, block, group)
        return Registry.register(Registry.BLOCK, Identifier(MCCourse.MOD_ID, name), block)
    }

    private fun registerBlockItem(name: String, block: Block, group: ItemGroup): Item {
        return Registry.register(Registry.ITEM, Identifier(MCCourse.MOD_ID, name),
            BlockItem(block, FabricItemSettings().group(group)))
    }

    fun registerModBlocks() {
        println("Registering Mod Blocks for ${MCCourse.MOD_ID}")
    }
}