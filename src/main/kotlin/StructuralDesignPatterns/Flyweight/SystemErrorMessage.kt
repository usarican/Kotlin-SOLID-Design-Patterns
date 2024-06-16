package StructuralDesignPatterns.Flyweight

/**
 * Concrete Flyweight
 */
class SystemErrorMessage(
    private val messageTemplate : String,
    private val baseTemplateUrl : String,
) : ErrorMessage {

    override fun getText(errorCode: Int?): String {
        return messageTemplate.replace("errorCode",errorCode.toString()) + "$baseTemplateUrl$errorCode"
    }
}