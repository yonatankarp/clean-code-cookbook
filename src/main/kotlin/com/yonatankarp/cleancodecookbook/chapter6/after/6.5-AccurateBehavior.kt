package com.yonatankarp.cleancodecookbook.chapter6.after

fun Int.add(adder: Int) = this + adder
// Extending the Int functionality as it is the right place for adding responsibility

class GraphicEditor {
    fun drawCircle(radius: Double) {
        println("Drawing a circle with radius $radius and circumference ${2 * RealConstants.pi() * radius}")
    }
}

// PI's definition is RealConstants (or Number's) responsibility
object RealConstants {
    fun pi() = 3.14f
}
