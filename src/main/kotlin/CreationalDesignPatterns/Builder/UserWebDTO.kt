package CreationalDesignPatterns.Builder

class UserWebDTO(
    private val userN: String?,
    private val userAd: String?,
    private val userAg: Int?
) : UserDTO(userN,userAd,userAg) {
}