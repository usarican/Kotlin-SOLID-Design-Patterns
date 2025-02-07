package BehavioralDesignPatterns.Template

data class Beverage(
    val name: String,
    val cupSize: String,
    val beverageType: BeverageType
)

enum class BeverageType {
    Coffee, Tea
}
