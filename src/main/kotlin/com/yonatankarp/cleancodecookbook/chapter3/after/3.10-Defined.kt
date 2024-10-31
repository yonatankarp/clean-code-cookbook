package com.yonatankarp.cleancodecookbook.chapter3.after

class Dream(var presentation: String = "")

fun main() {
    val nightmare = Dream()

    nightmare.presentation = "I am the Sandman"

    println(nightmare.presentation) // Output: "I am the Sandman"
}
