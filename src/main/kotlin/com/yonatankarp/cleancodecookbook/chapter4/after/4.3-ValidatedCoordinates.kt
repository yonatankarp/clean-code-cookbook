package com.yonatankarp.cleancodecookbook.chapter4.after

class GeographicCoordinates(val latitude: Int, val longitude: Int) {
    init {
        require(latitude in -90..90) { "Latitude must be between -90 and 90" }
        require(longitude in -180..180) { "Longitude must be between -180 and 180" }
    }
}

private val coordinates = GeographicCoordinates(latitude = 1000, longitude = 2000)
// Should throw an error since these values don’t exist on Earth
