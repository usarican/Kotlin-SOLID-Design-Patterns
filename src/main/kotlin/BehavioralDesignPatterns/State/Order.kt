package BehavioralDesignPatterns.State

class Order {
    private var currentState: OrderState = NewState()
    fun cancel(): Double {
        val charges = currentState.handleCancellation()
        currentState = Cancelled()
        return charges
    }

    fun paymentSuccessful() {
        currentState = PaidState()
    }

    fun dispatched() {
        currentState = InTransitState()

    }

    fun delivered() {
        currentState = DeliveredState()

    }
}