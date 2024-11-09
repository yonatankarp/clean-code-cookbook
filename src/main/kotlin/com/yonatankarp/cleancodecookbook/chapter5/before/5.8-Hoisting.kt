package com.yonatankarp.cleancodecookbook.chapter5.before

fun main() {
    var willBeDefinedLater: String? = null
    println(willBeDefinedLater)  // Output: null (but no error)

    willBeDefinedLater = "Beatriz"
    println(willBeDefinedLater)  // Output: "Beatriz"

}
