package com.yonatankarp.cleancodecookbook.chapter3.before

class Dream {
    private val properties = mutableMapOf<String, String>()

    operator fun get(propertyName: String) = properties[propertyName]

    operator fun set(propertyName: String, value: String) {
        properties[propertyName] = value
    }
}

fun main() {
    val nightmare = Dream()

    nightmare["presentation"] = "I am the Sandman"
    // Kotlin doesn't really support dynamic properties, so we have to use a
    // map-like syntax to access the properties and create them dynamically

    println(nightmare["presentation"]) // Output: "I am the Sandman"
}
