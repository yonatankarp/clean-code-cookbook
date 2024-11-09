package com.yonatankarp.cleancodecookbook.chapter5.after

fun main() {
    val array = listOf(1,2)
    val newArray = array + 3
    // array => [1, 2] Didn't mutate
    // newArray = [1, 2, 3]
}
