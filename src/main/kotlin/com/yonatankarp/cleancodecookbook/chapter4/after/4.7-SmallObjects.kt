package com.yonatankarp.cleancodecookbook.chapter4.after

// First Example: Address Validation
class Address(val email: Email) {
    // Email is always valid / Code is cleaner and not duplicated
    // ...
}

// You can reuse this object many times avoiding copy-pasting
class Email(val address: String) {

    init {
        require(emailRegex.matches(address)) { "Invalid email address: $address" }
    }

    companion object {
        // Regex is a sample / It might be wrong
        // Emails and Urls are first-class objects
        private val emailRegex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]+".toRegex()
    }
}

// Second Example: Wordle
class Wordle {
    fun validateWord(word: WordleWord) {
        // Wordle word is a real world entity. Not a subset of string
    }
}

class WordleWord(val word: String) {
    // Avoid building invalid Wordle words,
    // For example, length != 5
}
