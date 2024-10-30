package com.yonatankarp.cleancodecookbook.chapter3.after

class Employee(
    // This is not a getter.
    // It is the Employee's responsibility to tell her/his name
    // Accidentally, you have implemented an attribute with the same name
    val name: String,
    private val workingStatus: WorkingStatus
)

sealed class WorkingStatus

data object HiredWorkingStatus : WorkingStatus()

// You have no magic setters or getters
// All methods are real and can be debugged
// Validations are implicit
// since the WorkingStatus object is valid by construction

fun main() {
    val john = Employee("John", HiredWorkingStatus)
    println(john.name) // returns 'John'
}


