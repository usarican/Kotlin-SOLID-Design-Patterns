package StructuralDesignPatterns.Flyweight

/**
 * Flyweight Factory. This class should be singleton.
 */
object ErrorMessageFactory {

    private val errorMessages  = mutableMapOf<ErrorType,SystemErrorMessage>()

    init {
        errorMessages[ErrorType.GenericSystemError] = SystemErrorMessage(
            "A generic error of type errorCode occured please refer to:\n",
            "http://google.com/q=\""
        )
        errorMessages[ErrorType.ServerError] = SystemErrorMessage(
            "A server error of type errorCode occured please refer to:\n",
            "http://google.com/q=\""
        )
        errorMessages[ErrorType.PageNotFoundError] = SystemErrorMessage(
            "Page not found error of type errorCode occured please refer to:\n",
            "http://google.com/q=\""
        )
    }

    fun getError(type : ErrorType) : SystemErrorMessage? = errorMessages[type]
    fun getUserBannedMessage(caseId : String) : UserBannedErrorMessage = UserBannedErrorMessage(caseId)
}