package CreationalDesignPatterns.AbstractFactory

class Ironclad : NavalUnit {
    override fun createNavalUnit() {
        printCreated("Ironclad")
    }
}