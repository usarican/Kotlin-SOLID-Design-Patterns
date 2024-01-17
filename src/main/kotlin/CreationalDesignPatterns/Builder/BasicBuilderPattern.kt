package CreationalDesignPatterns.Builder

class Workout private constructor(
    private val workoutName : String,
    private val setsOfWorkout : Int,
    private val numberOfRepeatOnSet : Int,
    private val weight : Int
) {
    fun print(){
        println("Workout Name = $workoutName")
    }

    class Builder {
        private var workoutName : String = ""
        private var setsOfWorkout : Int = 0
        private var numberOfRepsOnSet : Int = 0
        private var weightOfSet : Int = 0

        fun workoutName(workoutName : String) = apply { this.workoutName = workoutName }
        fun setsOfWorkout(sets : Int) = apply { this.setsOfWorkout = sets }
        fun numberOfReps(reps : Int) = apply { this.numberOfRepsOnSet = reps }
        fun weightOfSet(weight : Int) = apply { this.weightOfSet = weight }
        fun build() : Workout = Workout(workoutName,setsOfWorkout,numberOfRepsOnSet,weightOfSet)
    }
}