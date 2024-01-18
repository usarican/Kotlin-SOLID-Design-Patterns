package CreationalDesignPatterns.FactoryMethod

class Mercedes(
    override val carName: String,
    override val carModel: String,
    override val carPrice: Int) : Car()