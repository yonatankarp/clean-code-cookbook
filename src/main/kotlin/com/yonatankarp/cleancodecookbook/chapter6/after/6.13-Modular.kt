package com.yonatankarp.cleancodecookbook.chapter6.after

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun performAsyncOperations() {
    runCatching {
        val result1 = asyncFunc1()
        val result2 = asyncFunc2()
        val result3 = asyncFunc3()

        // Continue with further operations
    }.onFailure { println(it) }
}

fun main(): Unit = runBlocking {
    CoroutineScope(Dispatchers.IO).launch {
        performAsyncOperations()
    }
}

// Only to make code compile
suspend fun asyncFunc1() = "Result1"
suspend fun asyncFunc2() = "Result2"
suspend fun asyncFunc3() = "Result3"
