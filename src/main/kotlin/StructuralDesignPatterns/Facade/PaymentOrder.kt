package StructuralDesignPatterns.Facade

class PaymentOrder(
    private val customer: Customer,
    private val product : Product
) {
    fun paymentReceive() : Boolean {
        return if (customer.customerBalance >= product.productPrice){
            println("${customer.customerName} Buy ${product.productName}")
            true
        } else {
            println("${customer.customerName} has not enough money.")
            false
        }
    }
}