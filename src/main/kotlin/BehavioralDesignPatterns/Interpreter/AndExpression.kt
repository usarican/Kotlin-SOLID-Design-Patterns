package BehavioralDesignPatterns.Interpreter

/**
 * Non-Terminal Expression
 */
class AndExpression(
    private val firstExpression : PermissionExpression,
    private val secondExpression : PermissionExpression
) : PermissionExpression{

    override fun interpret(user: User): Boolean {
        return firstExpression.interpret(user) && secondExpression.interpret(user)
    }
}