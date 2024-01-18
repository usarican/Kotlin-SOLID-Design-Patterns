package CreationalDesignPatterns.FactoryMethod

class BMWFactory : CarFactory() {
    override fun createCar(carName: String, carModel: String, carPrice: Int): Car {
        return BMW(carName = carName, carModel = carModel, carPrice = carPrice)
    }
}