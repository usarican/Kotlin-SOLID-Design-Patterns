package BehavioralDesignPatterns.Memento

class Workflow(
    val name : String,
    vararg step : String
) {
    val steps = mutableListOf<String>()

    init {
        steps.addAll(step)
    }

    fun addStep(step : String){
        steps.add(step)
    }

    fun removeStep(step : String){
        steps.remove(step)
    }
}