package BehavioralDesignPatterns.observer

/**
 * This is our subject.
 * Whenever something changes in our order, we are going to notify all the listeners which are registered.
 */

class Order {
    private val observers = mutableListOf<OrderObserver>()
    private var totalPrice: Double = 0.0
        set(value) {
            field = value
            observers.forEach { observer ->
                observer.update(this)
            }
        }
    private var count: Int = 0
    private var discountRate: Double = 0.0
    private var shippingCost : Double = 0.0

    fun getTotalPrice(): Double {
        return if (discountRate > 0.0) {
            (totalPrice + shippingCost) - ((totalPrice + shippingCost) * (discountRate.coerceAtLeast(1.0) / 100))
        } else {
            totalPrice + shippingCost
        }
    }

    fun getCount() = count

    fun setDiscountRate(discountRate: Double) {
        this.discountRate = discountRate
    }

    fun setShippingCost(shippingCost: Double) {
        this.shippingCost = shippingCost
    }

    fun attach(observer: OrderObserver) = observers.add(observer)

    fun detach(observer: OrderObserver) = observers.remove(observer)

    fun addItem(newItemPrice: Double) {
        totalPrice += newItemPrice
        count++
    }


}