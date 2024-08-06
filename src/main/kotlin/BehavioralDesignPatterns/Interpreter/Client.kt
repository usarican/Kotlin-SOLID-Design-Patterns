package BehavioralDesignPatterns.Interpreter

fun main(){
    val report = Report("Android SDK","USER OR ADMIN")
    val user = User(permissionList = listOf("USER"),"Utku")
    val expressionBuilder = ExpressionBuilder(report)
    val permissionExpression = expressionBuilder.build()
    println(permissionExpression.interpret(user))
}