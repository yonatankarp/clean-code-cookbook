package com.yonatankarp.cleancodecookbook.chapter6.before

class Workflow(private val stepWork: StepWork) {
    fun moveToNextTransition() {
        // You couple the business rule with the accidental implementation
        if (stepWork.hasPendingTasks()) {
            throw RuntimeException("Preconditions are not met yet..")
        } else {
            moveToNextStep()
        }
    }

    private fun moveToNextStep(): Unit = TODO()
}

// Only to make code compile
class StepWork {
    fun hasPendingTasks(): Boolean = TODO()
}
