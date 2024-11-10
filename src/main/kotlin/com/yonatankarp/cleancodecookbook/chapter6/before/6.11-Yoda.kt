package com.yonatankarp.cleancodecookbook.chapter6.before

private fun checkAnswer(answerToLifeMeaning: Int) {
    if (42 == answerToLifeMeaning) {
        // prevents the accidental assignation typo
        // since '42 = answerToLifeMeaning' is invalid
        // but 'answerToLifeMeaning = 42' is valid
    }
}
