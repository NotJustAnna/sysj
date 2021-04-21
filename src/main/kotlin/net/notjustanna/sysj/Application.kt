package net.notjustanna.sysj

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("net.notjustanna.sysj")
		.start()
}

