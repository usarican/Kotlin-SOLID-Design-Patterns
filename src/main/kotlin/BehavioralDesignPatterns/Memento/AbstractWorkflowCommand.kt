package BehavioralDesignPatterns.Memento

abstract class AbstractWorkflowCommand() : WorkflowCommand {
    protected lateinit var memento: WorkflowDesigner.Memento
    protected lateinit var receiver : WorkflowDesigner

    constructor(receiver : WorkflowDesigner) : this() {
        this.receiver = receiver
    }

    override fun undo() {
        receiver.setMemento(memento)
    }
}