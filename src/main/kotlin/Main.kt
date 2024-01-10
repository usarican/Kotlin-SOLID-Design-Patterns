import SOLID.OpenClosePrincipleExample.*
import SOLID.SingleReponsibilityPrincipleExample.*

fun main() {
    /*
    --- SingleResponsibilityExample ---
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
    println(userStoreCorrect.getUserList())*/

    /*
    --- Open - Closed Principle Example ---
    val shapeList = listOf(
        Circle(5.0),Square(10.0),Square(5.0)
    )
    val shapeListCorrect = listOf<ShapeC>(
        CircleCorrect(5.0),SquareCorrect(10.0),SquareCorrect(5.0),TriangleCorrect(10.0,5.0)
    )
    val areaCalculator = AreaCalculator(shapeList)
    val areaCalculatorCorrect = AreaCalculatorCorrect(shapeListCorrect)
    println(areaCalculator.sumOfArea())
    println(areaCalculatorCorrect.sumOfArea())*/

}