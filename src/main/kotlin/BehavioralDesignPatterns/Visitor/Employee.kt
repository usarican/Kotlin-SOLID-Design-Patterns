package BehavioralDesignPatterns.Visitor

interface Employee {
    fun getPerformanceRating() : Int
    fun setPerformanceRating(rating : Int)
    fun getDirectReports() : List<Employee>
    fun getEmployeeId() : Int
    fun accept(visitor: Visitor)
}