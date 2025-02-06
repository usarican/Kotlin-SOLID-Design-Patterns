package BehavioralDesignPatterns.State

class PaidState : OrderState {
    override fun handleCancellation(): Double {
        println("Contacting payment gateway to rollback transaction")
        return 10.5
    }
}