package com.yonatankarp.cleancodecookbook.chapter4.before

// First Example: Address Validation
class Address(private val emailAddress: String) {

    init {
        // String validation on Address class violates
        // the Single Responsibility Principle
        validateEmail(emailAddress)
    }

    private fun validateEmail(email: String) =
        require(emailRegex.matches(email)) { "Invalid email address: $email" }

    companion object {
        // Regex is a sample / It might be wrong
        // Emails and Urls should be first-class objects
        private val emailRegex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]+".toRegex()
    }
}

// Second Example: Wordle
class Wordle {
    fun validateWord(wordleWord: String) {
        // Wordle word should be a real-world entity. Not a subset of Strings
    }
}
