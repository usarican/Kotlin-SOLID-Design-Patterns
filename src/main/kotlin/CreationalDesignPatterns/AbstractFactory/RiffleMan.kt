package CreationalDesignPatterns.AbstractFactory

class RiffleMan : LandUnit {
    override fun createLandUnit() {
        printCreated("Riffle Man")
    }
}