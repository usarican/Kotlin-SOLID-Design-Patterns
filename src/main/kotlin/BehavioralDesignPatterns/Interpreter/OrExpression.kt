package BehavioralDesignPatterns.Interpreter

/**
 * Non-Terminal Expression
 */
class OrExpression(
    private val permissionOne : PermissionExpression,
    private val permissionTwo : PermissionExpression,
) : PermissionExpression {

    override fun interpret(user: User): Boolean {
        return permissionOne.interpret(user) || permissionTwo.interpret(user)
    }
}