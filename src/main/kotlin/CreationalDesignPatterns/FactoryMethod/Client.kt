package CreationalDesignPatterns.FactoryMethod

fun main(){
    val mercedesFactory = MercedesFactory()
    val bmwFactory = BMWFactory()
    mercedesFactory.create(carName = "Mercedes", carModel = "SL63", carPrice = 20000)
    bmwFactory.create(carName = "BMW", carModel = "M3", carPrice = 25000)
}