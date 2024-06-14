package StructuralDesignPatterns.Facade

class OrderFacade(
    private val customer: Customer,
    private val product : Product
) {
    private val inventoryOrder = InventoryOrder(customer,product)
    private val paymentOrder = PaymentOrder(customer,product)
    private val shippingOrder = ShippingOrder(customer,product)

    fun buyProduct() : Boolean {
        if (!inventoryOrder.addInventory()) return false
        if (!paymentOrder.paymentReceive()) return false
        if (!shippingOrder.productIsShipping(true)) return false
        return true
    }
}