package BehavioralDesignPatterns.observer

fun main(){
    val myOrder = Order()
    val priceObserver = PriceObserver()
    val countObserver = QuantityObserver()
    myOrder.attach(priceObserver)
    myOrder.attach(countObserver)

    myOrder.addItem(newItemPrice = 50.0)
    myOrder.addItem(newItemPrice = 50.0)
    myOrder.addItem(newItemPrice = 50.0)
    myOrder.addItem(newItemPrice = 50.0)
    myOrder.addItem(newItemPrice = 200.0)
    myOrder.addItem(newItemPrice = 500.0)
    myOrder.addItem(newItemPrice = 1000.0)
}