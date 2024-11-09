package com.yonatankarp.cleancodecookbook.chapter6.before

fun main() {
    val work = Work()
    if(!work.isNotFinished()) {
        // ...
    }
}

// Only to make code compile
class Work {
    fun isNotFinished() = false
}
