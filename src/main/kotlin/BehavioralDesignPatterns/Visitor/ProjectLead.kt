package BehavioralDesignPatterns.Visitor

class ProjectLead(val name: String, vararg employees: Employee) : AbstractEmployee(name) {
    private val directReports = mutableListOf<Employee>()

    init {
        directReports.addAll(employees)
    }

    override fun getDirectReports(): List<Employee> {
        return directReports
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}