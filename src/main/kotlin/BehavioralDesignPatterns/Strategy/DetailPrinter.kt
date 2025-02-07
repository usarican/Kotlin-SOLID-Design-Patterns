package BehavioralDesignPatterns.Strategy

class DetailPrinter : OrderPrinter {
    override fun print(orders: List<Order>) {
        println("****************** Detail Printer ************")
        var totalPrice = 0
        var totalOrderQuantity = 0
        orders.forEach {
            println("Order Id ${it.orderId} Order Price ${it.orderPrice} Order Quantity ${it.orderQuantity}")
            totalPrice += it.orderPrice
            totalOrderQuantity += it.orderQuantity
        }
        println("----------------------")
        println("Total Order Quantity $totalOrderQuantity")
        println("----------------------")
        println("Total Price #$totalPrice")
        println("**********************************************")
    }
}