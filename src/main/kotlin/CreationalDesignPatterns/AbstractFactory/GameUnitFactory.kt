package CreationalDesignPatterns.AbstractFactory

interface GameUnitFactory : Factory{
    fun createNavalUnit() : NavalUnit
    fun createLandUnit() : LandUnit

    override fun createAllUnits() {
        createNavalUnit().createNavalUnit()
        createLandUnit().createLandUnit()
    }
}