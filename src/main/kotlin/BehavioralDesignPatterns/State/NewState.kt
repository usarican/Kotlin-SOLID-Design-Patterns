package BehavioralDesignPatterns.State

class NewState : OrderState {
    override fun handleCancellation(): Double {
        println("Its new order so no need to charged")
        return 0.0
    }
}