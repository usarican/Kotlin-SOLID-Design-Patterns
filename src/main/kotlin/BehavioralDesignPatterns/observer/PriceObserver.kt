package BehavioralDesignPatterns.observer

class PriceObserver : OrderObserver {
    override fun update(order: Order) {
        when(order.getTotalPrice()){
            in 0.0..200.0 -> showPrice(order)
            in 200.0..1000.0 -> {
                order.setDiscountRate(discountRate = 10.0)
                showPrice(order)
            }
            in 1000.0..2000.0 -> {
                order.setDiscountRate(discountRate = 25.0)
                showPrice(order)
            }
            else -> showPrice(order)
        }
    }

    private fun showPrice(order: Order){
        println("Current Price of the Order : ${order.getTotalPrice()}")
    }
}