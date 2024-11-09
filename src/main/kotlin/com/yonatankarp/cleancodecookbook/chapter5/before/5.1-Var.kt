package com.yonatankarp.cleancodecookbook.chapter5.before

fun main() {
    var pi = 3.14
    var universeAgeInYears = 13_800_000_000

    pi = 3.1415 // no error
    universeAgeInYears = 13_800_000_001 // no error
}
