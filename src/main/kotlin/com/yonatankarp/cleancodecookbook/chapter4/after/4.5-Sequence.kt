package com.yonatankarp.cleancodecookbook.chapter4.after

fun main() {
    // create a sequence of numbers and use them with a hotspot
    val numbers = (0..100_000)

    // or
    val sequence = sequence {
        var i = 0
        while(true) {
            yield(i++)
        }
    }
}
