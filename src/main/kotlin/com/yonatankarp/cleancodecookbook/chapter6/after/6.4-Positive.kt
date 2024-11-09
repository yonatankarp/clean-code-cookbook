package com.yonatankarp.cleancodecookbook.chapter6.after

fun main() {
    val work = Work()
    if(work.isDone().not()) {
        // ...
    }
}

// Only to make code compile
class Work {
    fun isDone() = false
}
