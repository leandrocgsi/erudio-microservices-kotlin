package br.com.erudio.model

import java.util.Currency
import java.util.Date

data class Book (

    var id: Long = 0,
    var author: String = "",
    var launchDate: Date? = null,
    var price: Double? = null,
    var title: String = "",
    var currency: String = "",
    var environment: String? = ""
)