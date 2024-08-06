package BehavioralDesignPatterns.Interpreter

/**
 * Non-Terminal Expression
 */
class NotExpression(
    private val permission : PermissionExpression
) : PermissionExpression{
    override fun interpret(user: User): Boolean {
        return !permission.interpret(user)
    }
}