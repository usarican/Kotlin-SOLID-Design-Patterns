package BehavioralDesignPatterns.Interpreter

/**
 * Terminal Expression
 */
class Permission(
    private val permission : String
) : PermissionExpression {


    override fun interpret(user: User): Boolean {
        return user.getPermission().contains(permission)
    }
}