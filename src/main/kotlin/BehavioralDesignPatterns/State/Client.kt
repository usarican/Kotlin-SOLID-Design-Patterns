package BehavioralDesignPatterns.State

fun main(){
    val newOrder = Order()
    newOrder.paymentSuccessful()
    newOrder.cancel()
}