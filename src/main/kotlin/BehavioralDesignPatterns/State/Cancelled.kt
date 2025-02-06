package BehavioralDesignPatterns.State

class Cancelled : OrderState {
    override fun handleCancellation(): Double {
        throw IllegalStateException("Cancelled order. Cant cancel anymore")
    }
}