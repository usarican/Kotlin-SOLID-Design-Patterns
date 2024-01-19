package CreationalDesignPatterns.Prototype

class General : GameUnit() {

    private var state : String = "idle"

    fun morelBoost(){
        state = "Morel boosting"
    }

    override fun toString(): String {
        return "General state $state @ ${getPosition()}"
    }

    override fun clone(): GameUnit {
        throw CloneNotSupportedException("Generals are unique")
    }
    override fun reset() {
        throw CloneNotSupportedException("Generals does not support reset function ")
    }
}