package BehavioralDesignPatterns.Visitor

abstract class AbstractEmployee() : Employee {
    private var performanceRating = -1
    private lateinit var name: String
    private var employeeId: Int = 0

    constructor(name : String) : this(){
        this.name = name
        employeeId = EMPLOYEE_ID_COUNTER + 1
    }

    override fun getPerformanceRating(): Int {
        return performanceRating
    }

    override fun setPerformanceRating(rating: Int) {
        performanceRating = rating
    }

    override fun getEmployeeId(): Int {
        return employeeId
    }

    override fun getDirectReports(): List<Employee> {
        return emptyList()
    }

    companion object {
        private const val EMPLOYEE_ID_COUNTER = 101
    }
}