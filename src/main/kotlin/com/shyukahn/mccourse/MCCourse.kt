package com.shyukahn.mccourse
import com.shyukahn.mccourse.block.ModBlocks
import com.shyukahn.mccourse.enchantment.ModEnchantments
import com.shyukahn.mccourse.item.ModItems
import com.shyukahn.mccourse.util.ModRegistries
import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Suppress("UNUSED")
object MCCourse : ModInitializer {
    const val MOD_ID = "mccourse"
    val LOGGER: Logger = LogManager.getLogger(MOD_ID)

    override fun onInitialize() {

        ModItems.registerModItems()
        ModBlocks.registerModBlocks()

        ModEnchantments.registerModEnchantments()

        ModRegistries.registerModStuffs()

        LOGGER.info("Hello Fabric World!")
    }
}