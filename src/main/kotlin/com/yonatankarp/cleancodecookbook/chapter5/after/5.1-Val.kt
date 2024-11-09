package com.yonatankarp.cleancodecookbook.chapter5.after

fun main() {
    val pi = 3.14 // Value cannot mutate or change
    var universeAgeInYears = 13_800_000_000 // Value can change

    pi = 3.1415 // error. cannot define
    universeAgeInYears = 13_800_000_001 // no error
}
