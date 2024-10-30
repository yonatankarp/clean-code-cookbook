package com.yonatankarp.cleancodecookbook.chapter3.before

class Point(
    var x: Int = 0,
    var y: Int = 0,
)

fun main() {
    val location = Point()
    // At this moment, it is not clear which points are represented
    // It is coupled to the constructor decision
    // Might be null or some other convention

    location.x = 1
    // Now you have point(1,0)

    location.y = 2
    // Now you have point(1,2)

    // If you are setting essential properties, move them to the constructor
    // and remove the setter method
}
