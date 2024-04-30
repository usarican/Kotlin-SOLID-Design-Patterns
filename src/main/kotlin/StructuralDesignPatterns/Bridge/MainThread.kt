package StructuralDesignPatterns.Bridge

class MainThread : IThread {
    override fun run() {
        println("MainThread is running.")
    }

    override fun cancel() {
        println("MainThread is cancelled.")
    }

    override fun setDuration(duration: Int) {
        println("MainThread is running with $duration time.")
    }
}