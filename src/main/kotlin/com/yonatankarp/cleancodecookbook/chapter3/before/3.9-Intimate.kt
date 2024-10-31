package com.yonatankarp.cleancodecookbook.chapter3.before

import kotlin.math.pow
import kotlin.math.sqrt

data class Vector2D(
    val x: Int = 0,
    val y: Int = 0,
)

class DistanceCalculator {
    fun distanceBetween(origin: Vector2D, destination: Vector2D): Double =
        sqrt(
            ((destination.x - origin.x).toDouble().pow(2)) +
                    ((destination.y - origin.y).toDouble().pow(2))
        )
}
