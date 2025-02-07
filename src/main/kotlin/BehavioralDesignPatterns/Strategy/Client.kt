package BehavioralDesignPatterns.Strategy

fun main(){
    val orderList = listOf(
        Order(
            orderId = 0,
            orderQuantity = 4,
            orderPrice = 200
        ),
        Order(
            orderId = 1,
            orderQuantity = 2,
            orderPrice = 20
        ),
        Order(
            orderId = 2,
            orderQuantity = 10,
            orderPrice = 2100
        ),
        Order(
            orderId = 3,
            orderQuantity = 1,
            orderPrice = 500
        ),
        Order(
            orderId = 4,
            orderQuantity = 2,
            orderPrice = 400
        ),
    )
    val printToFileService = PrintToFileService(SummaryPrinter())
    val user = User(orders = orderList, printToFileService = printToFileService)
    user.getOrders()
}