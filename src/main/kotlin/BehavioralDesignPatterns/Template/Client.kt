package BehavioralDesignPatterns.Template

fun main(){
    val myBeverage = Beverage(
        name = "Americano",
        cupSize = "L",
        beverageType = BeverageType.Coffee
    )

    fun getBeverageMaker(beverage: Beverage) : BeverageMaker{
        return when(beverage.beverageType){
            BeverageType.Coffee -> CoffeeMaker()
            BeverageType.Tea -> TeaMaker()
        }
    }

    getBeverageMaker(myBeverage).makeBeverage(myBeverage)
}