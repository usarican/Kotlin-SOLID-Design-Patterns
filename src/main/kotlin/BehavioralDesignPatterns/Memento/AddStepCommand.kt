package BehavioralDesignPatterns.Memento

class AddStepCommand(
    private val designer: WorkflowDesigner,
    private val step : String
) : AbstractWorkflowCommand(designer) {

    override fun execute() {
        this.memento = receiver.getMemento()
        receiver.addStep(step)
    }
}