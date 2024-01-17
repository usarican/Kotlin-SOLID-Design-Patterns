package CreationalDesignPatterns.SimpleFactory

class SimplePizzaFactory {
    companion object {
        fun createPizza(type : PizzaType) : Pizza {
            return when(type){
                PizzaType.CHEESE -> CheesePizza()
                PizzaType.VEGGIE -> VeggiePizza()
                PizzaType.PEPPERONI -> PepperoniPizza()
                else -> {
                    throw IllegalAccessException("Pizza Type does not found")
                }
            }
        }
    }
}

enum class PizzaType {
    CHEESE,VEGGIE,PEPPERONI
}