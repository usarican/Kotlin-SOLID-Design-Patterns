package CreationalDesignPatterns.Builder

class UserWebDTOBuilderImp : UserDTOBuilder {
    private var firstName : String? = null
    private var lastName : String? = null
    private var address : String? = null
    private var age : Int? = null
    private var dto : UserWebDTO? = null

    override fun withFirstName(firstName: String) = apply { this.firstName = firstName }

    override fun withLastName(lastName: String) = apply { this.lastName = lastName }

    override fun withAddress(usrAddress: String) = apply { this.address = usrAddress }

    override fun withAge(usrAge: Int) = apply { this.age = usrAge }

    override fun build(): UserDTO? {
        dto = UserWebDTO(this.firstName + " " + this.lastName, this.address, this.age)
        return dto
    }

    override fun getUserDTO(): UserDTO? {
        return dto
    }
}