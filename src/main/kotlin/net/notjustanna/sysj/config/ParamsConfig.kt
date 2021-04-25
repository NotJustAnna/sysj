package net.notjustanna.sysj.config

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import net.notjustanna.sysj.params.Params
import net.notjustanna.sysj.tasks.HttpTasks
import java.io.File
import java.util.concurrent.TimeUnit

@Serializable
data class ParamsConfig(val params: Map<String, String>) {
    fun configure(params: Params) {
        params.map.putAll(this.params)
    }

    companion object {
        fun load(): ParamsConfig {
            return Json.decodeFromString(File("params.json").readText())
        }
    }
}

