package com.yonatankarp.cleancodecookbook.chapter6.after

private val prefix = "^\\+"
private val digit = "[0-9]"
private val space = "[- -]"
private val phoneRegex = "^$prefix(?:$digit$space?){6,14}$digit$".toRegex()
