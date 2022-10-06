package br.com.erudio

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DockerController {

    var logger: Logger = LoggerFactory.getLogger(DockerController::class.java)

    @GetMapping("/hello-docker")
    fun greeting(): HelloDocker {

        logger.info("Endpoint /hello-docker is called!!!");

        var hostName = System.getenv("HOSTNAME")

        if (hostName.isNullOrBlank()) hostName = System.getenv("COMPUTERNAME")

        return HelloDocker(
            "Hello Docker",
            hostName
        )
    }
}