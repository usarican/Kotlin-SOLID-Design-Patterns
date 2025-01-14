package BehavioralDesignPatterns.Memento

class RemoveStepCommand(
    override val designer: WorkflowDesigner, private val step: String
) : AbstractWorkflowCommand(designer = designer){
    override fun execute() {
        memento = designer.getMemento()
        designer.removeStep(step)
    }
}