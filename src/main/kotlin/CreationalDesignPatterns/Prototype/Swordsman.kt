package CreationalDesignPatterns.Prototype

class Swordsman : GameUnit() {

    private var state : String = "idle"

    fun attack(){
        state = "attacking"
    }

    override fun toString(): String {
        return "Swordsman $state @ ${getPosition()}"
    }

    override fun reset() {
        state = "idle"
    }
}