package BehavioralDesignPatterns.Memento

interface WorkflowCommand {
    fun execute()
    fun undo()
}