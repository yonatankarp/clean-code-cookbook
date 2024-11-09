package com.yonatankarp.cleancodecookbook.chapter5.before

fun main() {
    val array = mutableListOf(1, 2)
    array.add(3)
    // array => [1, 2, 3]
    // Wasn't it constant?
    // constant != immutable
}
