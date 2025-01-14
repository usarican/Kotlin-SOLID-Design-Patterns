package BehavioralDesignPatterns.Memento

import java.util.LinkedList

class Workflow(
    val name : String,
    val steps : LinkedList<String> = LinkedList()
) {

    fun addStep(step : String){
        steps.add(step)
    }

    fun removeStep(step : String){
        steps.remove(step)
    }

    override fun toString(): String {
        val builder : StringBuilder = StringBuilder("WorkFlow [name=")
        builder.append(name).append("]\nBEGIN ->")
        steps.forEach { step ->
            builder.append(step).append(" -> ")
        }
        return builder.toString()
    }

}