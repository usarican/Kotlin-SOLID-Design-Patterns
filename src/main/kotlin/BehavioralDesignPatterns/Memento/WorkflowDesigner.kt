package BehavioralDesignPatterns.Memento

import java.util.LinkedList

class WorkflowDesigner {

    private var workflow: Workflow? = null

    fun createWorkFlow(name: String) {
        this.workflow = Workflow(name = name)
    }

    fun addStep(step: String) {
        workflow?.addStep(step)
    }

    fun removeStep(step: String) {
        workflow?.removeStep(step)
    }

    fun getMemento(): Memento {
        return workflow?.let { Memento(it.steps, it.name) } ?: run { Memento() }
    }

    fun setMemento(memento: Memento) {
        if (memento.isEmpty()) {
            this.workflow = null
        } else {
            this.workflow = Workflow(memento.name, memento.steps)
        }
    }

    fun print(){
        println(workflow)
    }

    class Memento(
        internal val steps: LinkedList<String>, internal val name: String
    ) {

        internal fun isEmpty() = steps.isEmpty() && name.isEmpty()

        constructor() : this(LinkedList(), "")
    }

}