package com.yonatankarp.cleancodecookbook.chapter5.after

class Employee(
    val emails: MutableList<String> = mutableListOf(),
    val voiceMails: MutableList<String> = mutableListOf()
)
