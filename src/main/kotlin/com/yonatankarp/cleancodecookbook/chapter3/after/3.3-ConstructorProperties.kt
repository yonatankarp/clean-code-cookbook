package com.yonatankarp.cleancodecookbook.chapter3.after

class Point(val x: Int, val y: Int) // You remove the setters

fun main() {
    val location = Point(x = 1, y = 2)
}
