package CreationalDesignPatterns.AbstractFactory

fun main() {
    val industrialAgeGameUnitFactory = IndustrialAgeGameUnitFactory()
    val medievalGameUnitFactory = MedievalGameUnitFactory()

    createAllUnitsInFactory(industrialAgeGameUnitFactory)
    println("-------")
    createAllUnitsInFactory(medievalGameUnitFactory)
}

fun createAllUnitsInFactory(factory: Factory) {
    factory.createAllUnits()
}

fun printCreated(name : String) {
    println("$name is Created.")
}