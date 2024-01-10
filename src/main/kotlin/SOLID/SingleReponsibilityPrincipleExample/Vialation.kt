package SOLID.SingleReponsibilityPrincipleExample

class UserController(
    private val userStore : UserStore
) {

    fun createUser(newUser : User) {
        if(newUser.userId != null && newUser.userName != null && newUser.userName.isNotEmpty()){
            userStore.userList.add(newUser)
        }
    }
}

data class User(
    val userId : Int?,
    val userName : String?
)

class UserStore {
    val userList = mutableListOf<User>();
}