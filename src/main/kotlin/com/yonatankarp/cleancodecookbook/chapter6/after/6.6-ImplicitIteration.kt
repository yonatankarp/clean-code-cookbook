package com.yonatankarp.cleancodecookbook.chapter6.after

fun main() {
    val colors = listOf("red", "green", "blue")

    for (color in colors) {
        println(color)
    }

    // Or
    colors.forEach {
        println(it)
    }
}
