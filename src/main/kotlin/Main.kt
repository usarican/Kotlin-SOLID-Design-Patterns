import solid.SingleReponsibilityPrincipleExample.*

fun main() {
    val userStore = UserStore()
    val userStoreCorrect = UserStoreCorrect()
    val userController = UserController(userStore)
    val userControllerCorrect = UserControllerCorrect(userStoreCorrect)

    val validUserData = User(10,"Utku")
    val validUserData2 = User(35,"Aslı")
    val invalidUserData = User(null,null)
    val invalidUserData2 = User(10,"")

    userController.createUser(validUserData)
    userController.createUser(validUserData2)
    userController.createUser(invalidUserData)
    userController.createUser(invalidUserData)

    userControllerCorrect.createUser(validUserData)
    userControllerCorrect.createUser(validUserData2)
    userControllerCorrect.createUser(invalidUserData2)
    userControllerCorrect.createUser(invalidUserData2)

    println(userStore.userList)
    println(userStoreCorrect.getUserList())
}