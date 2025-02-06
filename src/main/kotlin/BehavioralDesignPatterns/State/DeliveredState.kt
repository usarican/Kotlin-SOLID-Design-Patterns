package BehavioralDesignPatterns.State

class DeliveredState : OrderState {
    override fun handleCancellation(): Double {
        println("Contact courier service for item pickup")
        println("Payment roll back will be initiated upon receiving returned item")
        return 25.0
    }
}