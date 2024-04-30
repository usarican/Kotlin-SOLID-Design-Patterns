package StructuralDesignPatterns.Bridge

interface IThread {
    fun run()
    fun cancel()
    fun setDuration(duration : Int)
}