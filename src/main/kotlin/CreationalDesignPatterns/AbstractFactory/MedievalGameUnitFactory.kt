package CreationalDesignPatterns.AbstractFactory

class MedievalGameUnitFactory : GameUnitFactory {
    override fun createNavalUnit(): NavalUnit {
        return Galley()
    }

    override fun createLandUnit(): LandUnit {
        return Swordsman()
    }
}