package StructuralDesignPatterns.Bridge

fun main(){
    val ioThread = IOThread()
    val mainThread = MainThread()

    val myThreadController = MyThreadController(ioThread)
    myThreadController.setThreadDuration(100)
}