package com.yonatankarp.cleancodecookbook.chapter5.before

class Employee {
    val emails: MutableList<String> by lazy { mutableListOf() }
    val voiceMails: MutableList<String> by lazy { mutableListOf() }
}
