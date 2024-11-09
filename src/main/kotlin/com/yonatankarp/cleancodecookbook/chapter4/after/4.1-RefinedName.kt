package com.yonatankarp.cleancodecookbook.chapter4.after

@JvmInline
value class Name(private val name: String) {
    init {
        // Name has its own creation rules, comparison, etc.
        // Might be different than a string
        // Moreover, the value class is converted to primitive type
        // during compilation, so it's not a performance issue.
    }
}

// Name is created as a valid one,
// you don't need to add validations here
class Person (private val name: Name)
