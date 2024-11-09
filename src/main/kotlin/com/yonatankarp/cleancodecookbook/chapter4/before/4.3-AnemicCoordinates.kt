package com.yonatankarp.cleancodecookbook.chapter4.before

class GeographicCoordinate(val latitude: Int, val longitude: Int)

private val coordinates = GeographicCoordinate(latitude = 1000, longitude = 2000)
// Should throw an error since these values don’t exist on Earth
