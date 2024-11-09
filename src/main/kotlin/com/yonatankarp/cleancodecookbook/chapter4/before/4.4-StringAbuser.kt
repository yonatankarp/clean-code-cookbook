package com.yonatankarp.cleancodecookbook.chapter4.before

fun main() {
    val schoolDescription = "College of Springfield"
    val location = "[^ ]*$".toRegex().find(schoolDescription)?.value // 'Springfield'
    val school = schoolDescription.split("[\\s,]+", limit = 3).first() // 'College'
}

