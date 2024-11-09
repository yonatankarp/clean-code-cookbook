package com.yonatankarp.cleancodecookbook.chapter6.before

fun main() {
    val colors = listOf("red", "green", "blue")
    for(i in 0 ..< colors.size) {
        println(colors[i])
    }
}
