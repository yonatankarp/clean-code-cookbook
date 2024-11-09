package com.yonatankarp.cleancodecookbook.chapter6.after

fun printLineTotal(item: Item) {
    val lineTotal: Double = item.price * item.quantity
    println("Line total: $lineTotal")
}

fun printAmountTotal(order: Order) {
    val amountTotal: Double = order.total - order.discount
    println("Amount due: $amountTotal")
}

// Only to make code compile
data class Item(val price: Double, val quantity: Int)
data class Order(val total: Double, val discount: Double)
