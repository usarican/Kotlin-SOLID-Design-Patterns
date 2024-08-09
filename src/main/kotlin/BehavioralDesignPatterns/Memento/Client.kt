package BehavioralDesignPatterns.Memento

fun main(){
    val workflow = Workflow("First Work Flow","A","B")
    val workflowDesigner = WorkflowDesigner(workflow)
    val addStepCommand = AddStepCommand(workflowDesigner,"First Flow")
    addStepCommand.execute()
    println( workflowDesigner.getWorkflow()?.steps)
}