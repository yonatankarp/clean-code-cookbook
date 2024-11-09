package com.yonatankarp.cleancodecookbook.chapter6.before

fun main() {
    val item = Item(10.0, 5)

    // print line total
    var total = item.price * item.quantity
    println("Line total: $total")

    val order = Order(100.0, 10.0)

    total = order.total - order.discount
    println("Amount due: $total")
}

// Only to make code compile
data class Item(val price: Double, val quantity: Int)
data class Order(val total: Double, val discount: Double)
