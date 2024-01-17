package CreationalDesignPatterns.Builder

open class UserDTO(
    private val userName: String?,
    private val userAddress: String?,
    private val userAge: Int?
)  {

    fun getUserName(): String? = this.userName

    fun getUserAddress(): String? = this.userAddress

    fun getUserAge(): Int? = this.userAge


}