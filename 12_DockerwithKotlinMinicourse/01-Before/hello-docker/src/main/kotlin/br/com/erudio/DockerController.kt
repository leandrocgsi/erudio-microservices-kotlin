package br.com.erudio

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DockerController {

    @GetMapping("/hello-docker")
    fun greeting(): HelloDocker {

        var hostName = System.getenv("HOSTNAME")

        if (hostName.isNullOrBlank()) hostName = System.getenv("COMPUTERNAME")

        return HelloDocker(
            "Hello Docker",
            hostName
        )
    }
}