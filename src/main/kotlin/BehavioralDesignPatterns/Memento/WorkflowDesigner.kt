package BehavioralDesignPatterns.Memento

class WorkflowDesigner() {

    private var workflow : Workflow? = null

    constructor(workflow: Workflow) : this(){
        this.workflow = workflow
    }

    fun getWorkflow() = workflow

    fun addStep(step : String){
        workflow?.addStep(step)
    }

    fun removeStep(step : String){
        workflow?.removeStep(step)
    }

    fun getMemento() : Memento {
        return workflow?.let {
            Memento(it.steps,it.name)
        } ?: Memento()

    }

    fun setMemento(memento : Memento) {
        if (memento.isEmpty()){
            workflow = null
        } else {
            this.workflow = Workflow(memento.getName(),*memento.getSteps().toTypedArray())
        }
    }

    class Memento {
        private var steps : List<String> = emptyList()
        private var name : String = ""

        constructor()

        constructor(steps : List<String>,name : String) : this() {
            this.steps = steps
            this.name = name
        }

        fun getSteps() = steps
        fun getName() = name

        fun isEmpty() = steps.isEmpty() && name.isEmpty()
    }
}