package com.yonatankarp.cleancodecookbook.chapter6.before

fun main() {
    asyncFunc1 { error, result1 ->
        if (error != null) {
            println(error)
        } else {
            asyncFunc2(result1) { error, result2 ->
                if (error != null) {
                    println(error)
                } else {
                    asyncFunc3(result2) { error, result3 ->
                        if (error != null) {
                            println(error)
                        } else {
                            // Nested callback continues...
                        }
                    }
                }
            }
        }
    }
}

// Only to make code compile
fun asyncFunc1(callback: (error: Exception?, result: String?) -> Unit) =
    callback(null, "Result1")

fun asyncFunc2(
    result1: String?,
    callback: (error: Exception?, result: String?) -> Unit
) = callback(null, "Result2")

fun asyncFunc3(
    result2: String?,
    callback: (error: Exception?, result: String?) -> Unit
) = callback(null, "Result3")
