package BehavioralDesignPatterns.Memento

class RemoveStepCommand(
    private val step : String
) : AbstractWorkflowCommand() {
    override fun execute() {
        this.memento = receiver.getMemento()
        receiver.removeStep(step)
    }
}