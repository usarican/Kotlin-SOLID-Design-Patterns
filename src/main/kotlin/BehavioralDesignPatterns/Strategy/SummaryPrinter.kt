package BehavioralDesignPatterns.Strategy

class SummaryPrinter : OrderPrinter {
    override fun print(orders: List<Order>) {
        println("****************** Summary Report ************")
        var totalPrice = 0
        orders.forEach {
            println("Order Id ${it.orderId} Order Price ${it.orderPrice}")
            totalPrice += it.orderPrice
        }
        println("Total Price #$totalPrice")
        println("**********************************************")
    }
}