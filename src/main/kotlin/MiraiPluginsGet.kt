package com.greenhandzdl.get


import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.Event
import net.mamoe.mirai.event.GlobalEventChannel
import net.mamoe.mirai.utils.info

object MiraiPluginsGet : KotlinPlugin(
    JvmPluginDescription(
        id = "com.example.demo",
        name = "mirai-plugins-get",
        version = "0.0.1",
    ) {
        author("greenhandzdl")
    }
) {
    override fun onEnable() {

        logger.info { "Plugin loaded" }
        GlobalEventChannel.subscribeAlways<Event> {



        }
    }

    override fun onDisable() {
        super.onDisable()
        logger.info{"Plugin disabled"}
    }
}
