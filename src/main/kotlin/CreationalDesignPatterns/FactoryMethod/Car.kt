package CreationalDesignPatterns.FactoryMethod

abstract class Car{
    abstract val carName : String
    abstract val carModel : String
    abstract val carPrice : Int

    fun getInformation(){
        println("Car Name = ${this.carName} - ${this.carModel}\nCar Price = ${this.carPrice} $")
    }
}