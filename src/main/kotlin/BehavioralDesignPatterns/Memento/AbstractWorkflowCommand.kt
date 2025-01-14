package BehavioralDesignPatterns.Memento

abstract class AbstractWorkflowCommand(
    protected var memento: WorkflowDesigner.Memento = WorkflowDesigner.Memento(),
    protected open val designer: WorkflowDesigner
) : WorkflowCommand {

    override fun undo() {
        designer.setMemento(memento)
    }

}