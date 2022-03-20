package com.shyukahn.mccourse.util

import com.shyukahn.mccourse.MCCourse
import net.fabricmc.fabric.api.tag.TagFactory
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier

object ModTags {
    object Blocks {
        val DOWSING_ROD_DETECTABLE_BLOCKS = createTag("dowsing_rod_detectable_blocks")
        val PAXEL_MINEABLE = createTag("mineable/paxel")

        val ORICHALCUM_BLOCKS = createCommonTag("orichalcum_blocks")
        val ORICHALCUM_ORES = createCommonTag("orichalcum_ores")

        private fun createTag(name: String): Tag.Identified<Block> {
            return TagFactory.BLOCK.create(Identifier(MCCourse.MOD_ID, name))
        }

        private fun createCommonTag(name: String): Tag.Identified<Block> {
            return TagFactory.BLOCK.create(Identifier("c", name))
        }
    }

    object Items {
        val ORICHALCUM_INGOTS = createCommonTag("orichalcum_ingots")
        val ORICHALCUM_NUGGETS = createCommonTag("orichalcum_nuggets")

        private fun createTag(name: String): Tag.Identified<Item> {
            return TagFactory.ITEM.create(Identifier(MCCourse.MOD_ID, name))
        }

        private fun createCommonTag(name: String): Tag.Identified<Item> {
            return TagFactory.ITEM.create(Identifier("c", name))
        }
    }
}