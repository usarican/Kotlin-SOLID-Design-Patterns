package CreationalDesignPatterns.SimpleFactory

fun main(){
    orderPizza(PizzaType.CHEESE).bake()
}

fun orderPizza(pizzaType: PizzaType) : Pizza {
    return SimplePizzaFactory.createPizza(pizzaType)
}