package StructuralDesignPatterns.Flyweight

/**
 * Unshared Concrete Flyweight
 */
class UserBannedErrorMessage(
) : ErrorMessage {
    private lateinit var caseId : String
    private var message : String? = null

    constructor(caseId: String) : this() {
        this.caseId = caseId
        message = "You violated terms of use.\n"
        message += "$caseId\n"
        message += "You are BANNED. Sorry.."
    }
    override fun getText(errorCode: Int?): String {
        return message ?: "Empty Messages"
    }
}