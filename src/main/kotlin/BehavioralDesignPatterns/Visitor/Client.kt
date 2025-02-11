package BehavioralDesignPatterns.Visitor

fun main() {
    val emps = buildOrganization()
    val visitor = PrintVisitor()
    visitOrgStructure(emps, visitor)
}

fun buildOrganization(): Employee {
    val p1: Programmer = Programmer(name ="Utku", skill = "Android")
    val p2: Programmer = Programmer("Halil", "Android")
    val p3: Programmer = Programmer("Furkan", "iOS")
    val p4: Programmer = Programmer("Bartu", "iOS")

    val pl1: ProjectLead = ProjectLead("Engin", p1, p2)
    val pl2: ProjectLead = ProjectLead("Cem", p3, p4)

    val m1: Manager = Manager("Burak", pl1)
    val m2: Manager = Manager("Ahmet", pl2)

    val cto: CTO = CTO("Ömer", m1, m2)

    return cto
}

/**
 * Object Structure
 */

fun visitOrgStructure(employee: Employee, visitor: Visitor) {
    employee.accept(visitor)
    employee.getDirectReports().forEach { employee ->
        visitOrgStructure(employee, visitor)
    }
}
