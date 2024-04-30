package StructuralDesignPatterns.Bridge

abstract class AbstractThreadController(private val thread : IThread) {

    open fun runThread(){
        thread.run()
    }

    open fun cancelThread(){
        thread.cancel()
    }

    open fun setThreadDuration(duration : Int){
        thread.setDuration(duration)
    }
}