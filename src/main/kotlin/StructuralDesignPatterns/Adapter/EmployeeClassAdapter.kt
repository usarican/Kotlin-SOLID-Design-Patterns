package StructuralDesignPatterns.Adapter

class EmployeeClassAdapter() : Employee(),Customer {
    override fun getName(): String {
        return this.fullName ?: ""
    }

    override fun getDesignation(): String {
        return this.jobTitle ?: ""
    }

    override fun getAdress(): String {
        return this.officeLocation ?: ""
    }
}