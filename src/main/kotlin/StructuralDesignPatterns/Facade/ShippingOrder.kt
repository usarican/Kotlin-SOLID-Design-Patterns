package StructuralDesignPatterns.Facade

class ShippingOrder(
    private val customer: Customer,
    private val product : Product
) {
    fun productIsShipping(getPaymentIsSuccess : Boolean) : Boolean {
        return if (getPaymentIsSuccess){
            println("${product.productName} is shipping to ${customer.customerName}")
            true
        } else {
            println("Payment is not recieved.")
            false
        }
    }
}