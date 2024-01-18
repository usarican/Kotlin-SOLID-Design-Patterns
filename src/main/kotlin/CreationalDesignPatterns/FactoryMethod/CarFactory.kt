package CreationalDesignPatterns.FactoryMethod

abstract class CarFactory {
    open fun create(carName: String, carModel: String, carPrice: Int) : Car {
        val car : Car = createCar(
            carName = carName, carModel = carModel, carPrice = carPrice
        )
        car.getInformation()
        return car
    }
    protected abstract fun createCar(carName: String, carModel: String, carPrice: Int) : Car
}