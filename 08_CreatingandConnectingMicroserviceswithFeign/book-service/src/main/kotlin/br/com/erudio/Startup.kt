package br.com.erudio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableFeignClients
class Startup

fun main(args: Array<String>) {
	runApplication<Startup>(*args)
}
