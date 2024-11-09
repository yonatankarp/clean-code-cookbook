package com.yonatankarp.cleancodecookbook.chapter5.before

private var counter = 0

fun incrementCounter(value: Int) {
    // Two side effects
    counter += value
    // it modifies the global variable counter

    println("Counter is now $counter")
    // It logs a message to the screen
}
