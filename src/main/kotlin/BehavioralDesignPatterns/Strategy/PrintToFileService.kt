package BehavioralDesignPatterns.Strategy

class PrintToFileService(
    private val printer: OrderPrinter
) {
    fun printOrders(orders : List<Order>){
        printer.print(orders)
    }
}