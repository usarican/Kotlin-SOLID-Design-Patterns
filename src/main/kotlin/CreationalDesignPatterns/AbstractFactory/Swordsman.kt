package CreationalDesignPatterns.AbstractFactory

class Swordsman : LandUnit {
    override fun createLandUnit() {
        printCreated("Swordsman")
    }
}