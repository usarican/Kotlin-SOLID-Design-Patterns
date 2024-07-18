package BehavioralDesignPatterns.ChainOfResponsibility

import java.util.Date

/**
 * Represent a request in our chain of responsibility
 */
data class LeaveApplication(
    val type : LeaveApplicationType,
    var status : ApplicationStatus,
    val from : Int,
    val to : Int,
    val processedBy : String
) {
    fun getNoOfDays() : Int = from - to
    fun approve(role : String) {
        this.status = ApplicationStatus.Approved
        println("This Application Approved from $role")
    }
}

enum class ApplicationStatus {
    Pending, Approved, Rejected
}

enum class LeaveApplicationType {
    SICK,PTO,LOP
}



