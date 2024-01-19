package CreationalDesignPatterns.Prototype

fun main(){
    try {
        val swordsman = Swordsman()
        swordsman.move(Direction.X,30)
        swordsman.attack()
        println(swordsman)
        val general = General()
        general.move(Direction.Y,10)
        general.morelBoost()
        val copySwordsman = swordsman.clone()
        println("Coppied swordsman $copySwordsman")
    }catch (exp : CloneNotSupportedException) {
        println(exp.message)
    }

}