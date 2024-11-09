package com.yonatankarp.cleancodecookbook.chapter4.after

import java.time.LocalDate
import java.time.temporal.ChronoUnit

data class Interval(val fromDate: LocalDate, val toDate: LocalDate) {
    init {
        require(fromDate < toDate) { "From date must be before to date" }
        // Of course the Interval must be immutable by using the keyword 'data'
    }

    fun elapsedDays() = ChronoUnit.DAYS.between(fromDate, toDate)
}

fun main() {
    val from = LocalDate.of(2018, 12, 9)
    val to = LocalDate.of(2002, 12, 22)

    val interval = Interval(from, to) // Invalid
}
