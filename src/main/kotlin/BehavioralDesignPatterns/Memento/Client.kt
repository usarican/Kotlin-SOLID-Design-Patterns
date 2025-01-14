package BehavioralDesignPatterns.Memento

import java.util.LinkedList

fun main() {
    val designer = WorkflowDesigner()
    val commands = runCommands(designer)
    designer.print()
    undoLastCommand(commands)
    designer.print()
}

fun undoLastCommand(commands: LinkedList<WorkflowCommand>){
    if (commands.isNotEmpty()){
        commands.removeLast().undo()
    }
}

fun runCommands(designer: WorkflowDesigner): LinkedList<WorkflowCommand> {
    val commands = LinkedList<WorkflowCommand>()
    val cmd = CreateCommand(designer = designer, name = "Leave Workflow")
    commands.addLast(cmd)
    cmd.execute()
    val cmd2 = AddStepCommand(designer = designer, step = "Create Leave Application")
    commands.addLast(cmd2)
    cmd2.execute()
    val cmd3 = AddStepCommand(designer = designer, step = "Submit Application")
    commands.addLast(cmd3)
    cmd3.execute()
    val cmd4 = AddStepCommand(designer = designer, step = "Application Approved")
    commands.addLast(cmd4)
    cmd4.execute()
    return commands
}