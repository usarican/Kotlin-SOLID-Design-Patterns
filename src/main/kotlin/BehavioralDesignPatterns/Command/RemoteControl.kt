package BehavioralDesignPatterns.Command

import java.util.*

/**
 * Invoker Class
 */
class RemoteControl {
    private val commandQueue : Queue<Command> = LinkedList()

    fun addCommand(vararg command : Command){
        command.forEach {
            commandQueue.offer(it)
            println("Command added $it")
            executeCommand()
        }
    }

    private fun executeCommand(){
        val command = commandQueue.remove()
        if (command != null){
            command.execute()
        } else {
            println("There is No Command")
        }
    }
}