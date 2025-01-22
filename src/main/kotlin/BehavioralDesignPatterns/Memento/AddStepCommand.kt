package BehavioralDesignPatterns.Memento

class AddStepCommand(
    override val designer: WorkflowDesigner, private val step: String,
) : AbstractWorkflowCommand(designer = designer) {
    override fun execute() {
        super.memento = designer.getMemento()
        println("Add Step Memento ${this.memento?.steps}")
        designer.addStep(step)
    }

}