package BehavioralDesignPatterns.Interpreter

/**
 *  Context
 */
class User(
    private val permissionList : List<String>,
    private val userName : String
) {
    fun getPermission() = permissionList
    fun getUsername() = userName
}