package com.shyukahn.mccourse
import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Suppress("UNUSED")
object MCCourse: ModInitializer {
    const val MOD_ID = "mccourse"
    val LOGGER: Logger = LogManager.getLogger(MOD_ID)

    override fun onInitialize() {
        LOGGER.info("Hello Fabric World!")
    }
}