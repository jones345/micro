package com.mananeo.dev.configserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudConfigServerApplication

fun main(args: Array<String>) {
	runApplication<CloudConfigServerApplication>(*args)
}
