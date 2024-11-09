package com.yonatankarp.cleancodecookbook.chapter6.before

private fun add(a: Int, b: Int) = a + b
// this is natural in many programming languages,
// but unnatural in real life

class GraphicEditor {
    fun drawCircle(radius: Double) {
        println("Drawing a circle with radius $radius and circumference ${2 * pi() * radius}")
    }

    companion object {
        fun pi() = 3.14f
    }
}
