package com.yonatankarp.cleancodecookbook.chapter4.after

import java.net.InetSocketAddress
import java.net.URI
import java.nio.file.Path

// Port is a small object with responsibilities and protocol
class Port {
    fun open(): Port = TODO()
    fun asUri(): URI = TODO()
    fun asInetSocketAddress(): InetSocketAddress = TODO()
    fun path(path: String): Path = TODO()

    companion object {
        fun parse(port: String): Port = TODO()
    }
}

fun main() {

    val server = Port.parse( "www.example.org:8080")

    val inPort = server.open() // returns a port, not a number
    val uri = server.asUri() // returns a URI
    val address: InetSocketAddress = server.asInetSocketAddress() // returns an Address
    val path: Path = server.path("/index.html") // returns a Path

    // all of them are validated small bijection objects with very few and
    // precise responsibilities
}
