package net.notjustanna.sysj.params

import java.util.concurrent.ConcurrentHashMap
import javax.inject.Singleton

@Singleton
class Params {
    val map = ConcurrentHashMap<String, String>()
}
