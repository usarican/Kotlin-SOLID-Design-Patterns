package CreationalDesignPatterns.Builder

fun main(){
    val user = User("Utku","Sarican","İzmir",24)
    val userDtoBuilder = UserDTOBuilderImp()
    val userWebDTOBuilder = UserWebDTOBuilderImp()
    Director.directorBuild(userDtoBuilder,user)?.print()
    Director.directorBuild(userWebDTOBuilder,user)?.print()

    Workout.Builder().workoutName("Bench Press")
        .build()
        .print()

}

fun UserDTO.print() {
    if (this is UserWebDTO) {
        println("It is user Web DTO $this")
    } else {
        println("It is user DTO $this")
    }
}