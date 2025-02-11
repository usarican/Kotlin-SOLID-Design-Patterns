package BehavioralDesignPatterns.Visitor

class Programmer(
    val skill : String,
    val name : String
) : AbstractEmployee(name) {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}