package com.yonatankarp.cleancodecookbook.chapter4.after

class EmailAddress(private val emailAddress: String) {
    init {
        require(expression.matches(emailAddress)) { "Invalid email address" }
    }

    companion object {
        private val expression = "^[\\w+.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$".toRegex()
    }
}
