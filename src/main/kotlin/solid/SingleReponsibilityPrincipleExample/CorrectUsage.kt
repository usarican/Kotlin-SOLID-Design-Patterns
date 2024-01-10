package solid.SingleReponsibilityPrincipleExample

class UserControllerCorrect(
    private val userStore : UserStoreCorrect
) {
    private val userValidator = UserValidator()

    fun createUser(newUser : User) {
        if(userValidator.validateUser(newUser)){
            userStore.addUserToList(newUser)
        }
    }
}


class UserStoreCorrect {
    private val userList = mutableListOf<User>()
    fun getUserList() = userList
    fun addUserToList(newUser : User){
        userList.add(newUser)
    }
}

class UserValidator(){
    fun validateUser(newUser: User) =
        newUser.userId != null && newUser.userName != null && newUser.userName.isNotEmpty()
}