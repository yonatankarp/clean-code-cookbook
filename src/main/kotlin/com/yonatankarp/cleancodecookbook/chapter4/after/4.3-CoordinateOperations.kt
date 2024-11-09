package com.yonatankarp.cleancodecookbook.chapter4.after

import com.yonatankarp.cleancodecookbook.chapter4.before.GeographicCoordinate
import java.awt.Polygon

@JvmInline
value class Latitude(val value: Double) {
    init {
        require(value in -90.0..90.0) { "Latitude must be between -90 and 90 degrees" }
    }
}

@JvmInline
value class Longitude(val value: Double) {
    init {
        require(value in -180.0..180.0) { "Longitude must be between -180 and 180 degrees" }
    }
}

class GeographicCoordinate {
    fun distanceTo(coordinate: GeographicCoordinate): Double = TODO()
    fun pointInPolygon(polygon: Polygon): Boolean = TODO()
}

// Now you are in the geometry world (and not in the world of arrays anymore).
// You can safely do many exciting things.
