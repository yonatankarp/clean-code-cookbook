package com.yonatankarp.cleancodecookbook.chapter5.after

private const val USER_PASSWORD = "123456"

class User(private val password: String)

fun configureUser1() {
    val user = User(USER_PASSWORD)
}

// Alternative with a function

fun configureUser2() {
    val user = User(userPassword())
}

fun userPassword() = USER_PASSWORD
