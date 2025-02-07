package BehavioralDesignPatterns.Template

abstract class BeverageMaker {
    fun makeBeverage(beverage: Beverage){
        boilWater()
        brew()
        pourInCup()
        ready(beverage)
    }

    open fun boilWater(){
        println("Water Boiling...")
    }

    abstract fun brew()

    open fun pourInCup(){
        println("Pour in Cup...")
    }

    open fun ready(beverage: Beverage){
        println("Your beverage ${beverage.name} is ready..")
    }

}