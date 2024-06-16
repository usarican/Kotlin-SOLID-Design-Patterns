package StructuralDesignPatterns.Flyweight

fun main(){
    val systemErrorMessage = ErrorMessageFactory.getError(ErrorType.ServerError)
    println(systemErrorMessage?.getText(1001))

    val userBannedErrorMessage = ErrorMessageFactory.getUserBannedMessage("Case 9")
    println(userBannedErrorMessage.getText(null))
}