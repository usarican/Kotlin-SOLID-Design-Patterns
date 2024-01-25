package CreationalDesignPatterns.Singleton

class EagerSingleton private constructor(){

    val name = "Eager Singleton"
    fun printName(){
        println("$name is Printed." )
    }

    companion object {
        private val INSTANCE : EagerSingleton = EagerSingleton()
        fun eagerRegister() : EagerSingleton = INSTANCE
    }
}