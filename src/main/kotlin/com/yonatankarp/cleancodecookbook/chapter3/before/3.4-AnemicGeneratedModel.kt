package com.yonatankarp.cleancodecookbook.chapter3.before

object Validators {
    fun getIntegerValidator(value: Int): Int = TODO()
    fun getStringValidator(value: String): String = TODO()
    fun getBooleanValidator(value: Boolean): Boolean = TODO()
}

data class Employee(
    private var _id: Int = 0,
    private var _name: String = "",
    private var _currentlyWorking: Boolean = false
) {
    var id: Int
        get() = _id
        set(value) {
            _id = Validators.getIntegerValidator(value)
        }

    var name: String
        get() = _name
        set(value) {
            _name = Validators.getStringValidator(value)
        }

    var currentlyWorking: Boolean
        get() = _currentlyWorking
        set(value) {
            _currentlyWorking = Validators.getBooleanValidator(value)
        }
}

fun main() {
    val john = Employee().apply {
        id = 1
        name = "John"
        currentlyWorking = true
    }

    println(john.name) // returns 'John'
}



