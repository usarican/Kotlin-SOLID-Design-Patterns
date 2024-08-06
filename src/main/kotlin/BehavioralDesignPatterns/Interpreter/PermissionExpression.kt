package BehavioralDesignPatterns.Interpreter

/**
 * Abstract Expression
 */
interface PermissionExpression {
    fun interpret(user : User) : Boolean
}