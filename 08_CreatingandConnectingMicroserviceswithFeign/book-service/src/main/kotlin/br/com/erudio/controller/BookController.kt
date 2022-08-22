package br.com.erudio.controller

import br.com.erudio.model.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Date

@RestController
@RequestMapping("book-service")
class BookController {

    @Autowired
    private lateinit var environment: Environment

    //http://localhost:8100/book-service/1/BRL
    @GetMapping(value = ["/{id}/{currency}"])
    fun findBook(
        @PathVariable("id") id: Long,
        @PathVariable("currency") currency: String
    ): Book? {
        val port = environment.getProperty("local.server.port")
        return Book(
            id = 1L,
            author = "Nigel Poulton",
            title = "Docker Deep Dive",
            launchDate = Date(),
            price = 15.8.toDouble(),
            currency = currency,
            environment = port
        )
    }
}