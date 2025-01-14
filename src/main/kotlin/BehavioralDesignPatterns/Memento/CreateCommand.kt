package BehavioralDesignPatterns.Memento

class CreateCommand(
    private val name : String,
    override val designer: WorkflowDesigner
) : AbstractWorkflowCommand(designer = designer){
    override fun execute() {
        this.memento = designer.getMemento()
        designer.createWorkFlow(name)
    }
}