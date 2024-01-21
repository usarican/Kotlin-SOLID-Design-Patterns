package CreationalDesignPatterns.AbstractFactory

class Galley : NavalUnit {
    override fun createNavalUnit() {
        printCreated("Galley")
    }
}