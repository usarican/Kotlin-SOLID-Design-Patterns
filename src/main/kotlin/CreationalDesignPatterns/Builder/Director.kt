package CreationalDesignPatterns.Builder

object Director {
    fun directorBuild(builder : UserDTOBuilder, user : User) : UserDTO? =
        builder.withFirstName(user.userFirstName)
            .withLastName(user.userLastName)
            .withAddress(user.userAddress)
            .withAge(user.userAge)
            .build()
}