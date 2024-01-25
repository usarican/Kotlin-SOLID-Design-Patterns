package CreationalDesignPatterns.Singleton

import kotlin.concurrent.thread

fun main(){
    val eagerSingleton = EagerSingleton.eagerRegister()
    println(eagerSingleton.name)
    eagerSingleton.printName()
    val eagerSingleton2 = EagerSingleton.eagerRegister()
    println(eagerSingleton === eagerSingleton2)

    // Kotlin way eager Singleton implementation.
    val eagerSingletonKotlin = object {
        val name = "Utku"
        fun printName(){
            println(name)
        }
    }
    eagerSingletonKotlin.printName()

    val lazySingleton = LazySingleton.getInstance()
    lazySingleton.instanceNum = 10
    val lazySingleton2 = LazySingleton.getInstance()
    println(lazySingleton2.instanceNum)
    println("Current Thread ${Thread.currentThread().name}")
    thread {
        val lazySingleton3 = LazySingleton.getInstance()
        lazySingleton3.instanceNum = 50
        println("Current Thread ${Thread.currentThread().name}")
        println(lazySingleton3 == lazySingleton)
        println(lazySingleton.instanceNum)

    }
    println(lazySingleton == lazySingleton2)
    println(lazySingleton.instanceNum)


}