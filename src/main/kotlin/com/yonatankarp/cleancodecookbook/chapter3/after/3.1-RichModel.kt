package com.yonatankarp.cleancodecookbook.chapter3.after

data class Song(
    val name: String,
    val author: Artist, // Will reference rich objects
    val album: Album,  // instead of primitive data types
) {
    fun albumName() = album.name
}

class Artist
data class Album(val name: String)
