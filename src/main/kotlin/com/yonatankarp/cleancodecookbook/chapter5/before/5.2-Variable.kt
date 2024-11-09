package com.yonatankarp.cleancodecookbook.chapter5.before

class User(private val password: String)

fun configureUser() {
    val password = "123456"
    // Setting a password on a variable is a vulnerability
    val user = User(password)
    // Notice the variable doesn't change
}
