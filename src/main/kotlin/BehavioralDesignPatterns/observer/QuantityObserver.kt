package BehavioralDesignPatterns.observer

class QuantityObserver : OrderObserver {
    override fun update(order: Order) {
      when(order.getCount()){
          in 0..5 -> showCount(order)
          in 5..10 -> {
              order.setShippingCost(100.0)
              showCount(order)
          }
          else -> showCount(order)
      }
    }

    private fun showCount(order: Order){
        println("Current Count of the Order : ${order.getCount()}")
    }
}