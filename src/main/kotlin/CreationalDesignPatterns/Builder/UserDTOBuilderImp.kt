package CreationalDesignPatterns.Builder

class UserDTOBuilderImp : UserDTOBuilder {

    private var firstName : String? = null
    private var lastName : String? = null
    private var address : String? = null
    private var age : Int? = null
    private var dto : UserDTO? = null

    override fun withFirstName(firstName: String): UserDTOBuilder {
        this.firstName = firstName
        return this
    }

    override fun withLastName(lastName: String): UserDTOBuilder {
        this.lastName = lastName
        return this
    }

    override fun withAddress(usrAddress: String): UserDTOBuilder {
        this.address = usrAddress
        return this
    }

    override fun withAge(usrAge: Int): UserDTOBuilder {
        this.age = usrAge
        return this
    }

    override fun build(): UserDTO? {
        dto = UserDTO(this.firstName + " " + this.lastName,this.address,this.age)
        return dto
    }

    override fun getUserDTO(): UserDTO? {
        return dto
    }
}