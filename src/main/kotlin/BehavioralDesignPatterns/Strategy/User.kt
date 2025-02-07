package BehavioralDesignPatterns.Strategy

class User(
    private val orders : List<Order>,
    private val printToFileService: PrintToFileService
) {
    fun getOrders(){
        printToFileService.printOrders(orders)
    }
}