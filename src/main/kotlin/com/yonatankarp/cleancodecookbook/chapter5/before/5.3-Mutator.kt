package com.yonatankarp.cleancodecookbook.chapter5.before

import java.time.LocalDate

fun main() {
    val date = LocalDate.now()
    date.withMonth(4)
}
