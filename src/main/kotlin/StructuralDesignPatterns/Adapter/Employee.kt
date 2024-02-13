package StructuralDesignPatterns.Adapter

/* Adaptee */
open class Employee(
    private var _fullName: String? = null,
    private var _jobTitle: String? = null,
    private var _officeLocation: String? = null
) {

    var fullName: String?
        get() = _fullName
        set(value) {
            _fullName = value
        }
    var jobTitle : String?
        get() = _jobTitle
        set(value) {
            _jobTitle = value
        }
    var officeLocation : String?
        get() = _officeLocation
        set(value) {
            _officeLocation = value
        }


}