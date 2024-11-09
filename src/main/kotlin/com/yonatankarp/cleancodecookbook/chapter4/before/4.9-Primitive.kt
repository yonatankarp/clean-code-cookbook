package com.yonatankarp.cleancodecookbook.chapter4.before

import java.time.LocalDate
import java.time.temporal.ChronoUnit

private val from = LocalDate.of(2018, 12, 9)
private val to = LocalDate.of(2022, 12, 22)

private val elapsed = elapsedDays(from, to)

private fun elapsedDays(from: LocalDate, to: LocalDate) =
    ChronoUnit.DAYS.between(from, to)

// You need to apply this short function
// or the inline version many times in your code
// You don't check fromDate to be less than toDate
// You can make accounting numbers with a negative value
