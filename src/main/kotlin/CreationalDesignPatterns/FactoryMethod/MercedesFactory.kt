package CreationalDesignPatterns.FactoryMethod

class MercedesFactory(
) : CarFactory() {
    override fun createCar(carName: String, carModel: String, carPrice: Int): Car {
        return Mercedes(carName = carName, carModel = carModel, carPrice = carPrice)
    }


}