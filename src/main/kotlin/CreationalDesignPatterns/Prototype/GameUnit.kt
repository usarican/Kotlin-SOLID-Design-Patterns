package CreationalDesignPatterns.Prototype

abstract class GameUnit : Cloneable {
    private lateinit var position : Position

    constructor(){
        position = Position(0,0,0)
    }

    constructor(x : Int, y : Int, z : Int) {
        position = Position(x,y,z)
    }

    fun move(direction: Direction,distance : Int) {
        position = when(direction){
            Direction.X -> position.copy(x = distance)
            Direction.Y -> position.copy(y = distance)
            Direction.Z -> position.copy(z = distance)
        }
    }

    fun getPosition() = position

    public override fun clone(): GameUnit {
        val gameUnit = super.clone() as GameUnit
        gameUnit.initialize()
        return gameUnit
    }

    protected fun initialize(){
        position = Position(0,0,0)
        reset()
    }
    protected abstract fun reset()
}

enum class Direction {
    X,Y,Z
}