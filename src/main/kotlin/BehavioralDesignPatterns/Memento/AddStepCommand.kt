package BehavioralDesignPatterns.Memento

class AddStepCommand(
    override val designer: WorkflowDesigner, private val step: String
) : AbstractWorkflowCommand(designer = designer) {
    override fun execute() {
        this.memento = designer.getMemento()
        designer.addStep(step)
    }

}