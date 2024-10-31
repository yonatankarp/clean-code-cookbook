package com.yonatankarp.cleancodecookbook.chapter3.after

import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.pow

class Vector2D(
    private val rho: Double,
    private val theta: Double
) {
    fun x() = rho * cos(theta)
    fun y() = rho * sin(theta)
}

class DistanceCalculator {
    fun distanceBetween(origin: Vector2D, destination: Vector2D): Double =
        sqrt(
            (destination.x() - origin.x()).pow(2) +
                    (destination.y() - origin.y()).pow(2)
        )
}
