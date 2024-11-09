package com.yonatankarp.cleancodecookbook.chapter6.after

import com.yonatankarp.cleancodecookbook.chapter6.before.StepWork

class Workflow(private val stepWork: StepWork) {
    fun moveToNextTransition() {
        if(canMoveOn()) moveToNextStep()
        else throw RuntimeException("Preconditions are not met yet..")
    }

    private fun canMoveOn() =
        // You hide accidental implementation 'the how'
        // under the 'what'
        stepWork.hasPendingTasks().not()


    private fun moveToNextStep(): Unit = TODO()
}

// Only to make code compile
class StepWork {
    fun hasPendingTasks(): Boolean = TODO()
}
