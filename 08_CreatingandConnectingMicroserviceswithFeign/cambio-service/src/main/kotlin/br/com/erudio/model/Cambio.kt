package br.com.erudio.model

import java.math.BigDecimal

data class Cambio (
    var id: Long = 0,
    var from: String = "",
    var to: String = "",
    var conversionFactor: BigDecimal = BigDecimal.ZERO,
    var convertedValue: BigDecimal = BigDecimal.ZERO,
    var environment: String = ""
)