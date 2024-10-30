package com.yonatankarp.cleancodecookbook.chapter3.after

class Person(personName: String) {
    // Immutable
    // No getters or setters
    private var name = personName

    // ... more protocol, probably accessing private variable name
}
