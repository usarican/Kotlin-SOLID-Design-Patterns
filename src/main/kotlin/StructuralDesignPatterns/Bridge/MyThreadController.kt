package StructuralDesignPatterns.Bridge

class MyThreadController(
    private val myThread : IThread
) : AbstractThreadController(myThread) {

    override fun setThreadDuration(duration: Int) {
        super.setThreadDuration(duration)
        println("My Thread Controller set Thread Duration $duration")
    }
}