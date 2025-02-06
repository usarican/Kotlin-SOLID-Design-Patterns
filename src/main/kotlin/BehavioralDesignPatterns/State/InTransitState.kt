package BehavioralDesignPatterns.State

class InTransitState : OrderState {
    override fun handleCancellation(): Double {
        println("Contact courier service for cancellation")
        println("Contacting payment gateway for transaction roll back")
        return 20.0
    }
}