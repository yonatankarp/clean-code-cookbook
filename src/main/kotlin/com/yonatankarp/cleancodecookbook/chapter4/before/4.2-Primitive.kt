package com.yonatankarp.cleancodecookbook.chapter4.before

import java.net.InetSocketAddress

fun main() {
    val port = 8080
    val inSocketAddress = InetSocketAddress("example.org", port)
    val uri = uriFromPort("example.org", port)
    val address = addressFromPort("example.org", port)
    val path = pathFromPort("example.org", port)
}

private fun uriFromPort(host: String, port: Int): String  = TODO()
private fun addressFromPort(host: String, port: Int): String  = TODO()
private fun pathFromPort(host: String, port: Int): String  = TODO()
