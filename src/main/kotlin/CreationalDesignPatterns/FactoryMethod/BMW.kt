package CreationalDesignPatterns.FactoryMethod

class BMW(
    override val carName: String,
    override val carModel: String,
    override val carPrice: Int) : Car()