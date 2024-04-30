package StructuralDesignPatterns.Bridge

class IOThread : IThread {
    override fun run() {
        println("IOThread is running.")
    }

    override fun cancel() {
        println("IOThread is cancelled.")
    }

    override fun setDuration(duration: Int) {
        println("IOThread is running with $duration time.")
    }

}