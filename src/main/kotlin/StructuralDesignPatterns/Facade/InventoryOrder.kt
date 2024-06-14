package StructuralDesignPatterns.Facade

class InventoryOrder(
    private val customer: Customer,
    private val product : Product
) {
    fun addInventory() : Boolean {
        return if (product.productIsAvailable){
            println("${customer.customerName} Added ${product.productName} in the Inventory")
            true
        } else {
            println("The product is not available")
            false
        }
    }
}