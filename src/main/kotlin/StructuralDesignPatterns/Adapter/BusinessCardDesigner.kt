package StructuralDesignPatterns.Adapter
/* Client */
fun main(){
    val employeeClassAdapter = EmployeeClassAdapter()
    populateEmployeeData(employeeClassAdapter)
    val businessCardDesigner = BusinessCardDesigner()
    println(businessCardDesigner.designCard(employeeClassAdapter))
}


class BusinessCardDesigner {
    fun designCard(customer : Customer) : String {
        var card : String = ""
        card += customer.getName()
        card += "\n${customer.getDesignation()}"
        card += "\n${customer.getAdress()}"
        return card
    }
}

fun populateEmployeeData(employee: Employee) {
    employee.fullName = "Ibrahim Utku Sarican"
    employee.officeLocation = "Bolge"
    employee.jobTitle = "Android Developer"
}