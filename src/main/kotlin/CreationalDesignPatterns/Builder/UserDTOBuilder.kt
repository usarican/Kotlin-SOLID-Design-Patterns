package CreationalDesignPatterns.Builder

interface UserDTOBuilder {
    fun withFirstName(firstName : String) : UserDTOBuilder
    fun withLastName(lastName : String) : UserDTOBuilder
    fun withAddress(usrAddress : String) : UserDTOBuilder
    fun withAge(usrAge : Int) : UserDTOBuilder
    fun build() : UserDTO?
    fun getUserDTO() : UserDTO?
}