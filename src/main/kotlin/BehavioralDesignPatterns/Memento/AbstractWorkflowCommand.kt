package BehavioralDesignPatterns.Memento

abstract class AbstractWorkflowCommand(
    protected var memento: WorkflowDesigner.Memento = WorkflowDesigner.Memento(),
    protected open val designer: WorkflowDesigner
) : WorkflowCommand {

    override fun undo() {
        println("Undo Memento ${memento?.steps}")
        memento.let { designer.setMemento(it) }

    }

}