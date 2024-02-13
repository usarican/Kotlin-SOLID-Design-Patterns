package StructuralDesignPatterns.Adapter

class EmployeeObjectAdapter(
    private val adaptee : Employee
) : Customer {
    override fun getName(): String {
        return adaptee.fullName ?: ""
    }

    override fun getDesignation(): String {
        return adaptee.jobTitle ?: ""
    }

    override fun getAdress(): String {
        return adaptee.officeLocation ?: ""
    }
}