package CreationalDesignPatterns.AbstractFactory

class IndustrialAgeGameUnitFactory : GameUnitFactory {
    override fun createNavalUnit(): NavalUnit {
        return Ironclad()
    }

    override fun createLandUnit(): LandUnit {
        return RiffleMan()
    }
}