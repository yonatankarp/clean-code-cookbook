package com.yonatankarp.cleancodecookbook.chapter4.before

import java.time.OffsetDateTime

fun main() {
    val ts1 = OffsetDateTime.now()
    val ts2 = OffsetDateTime.now() // Might be the same...
}
