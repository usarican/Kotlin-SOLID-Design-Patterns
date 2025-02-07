package BehavioralDesignPatterns.Template

class CoffeeMaker : BeverageMaker() {
    override fun brew() {
        println("Coffee is brewing...")
    }
}