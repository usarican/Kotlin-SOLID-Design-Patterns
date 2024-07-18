package BehavioralDesignPatterns.ChainOfResponsibility

fun main() {
    val leaveApplication = LeaveApplication(
        type = LeaveApplicationType.SICK,
        status = ApplicationStatus.Pending,
        from = 0,
        to = 1,
        processedBy = "Me"
    )
    val approver = createChain()
    approver.processLeaveApplication(leaveApplication)
}

fun createChain() : LeaveApprover {
    val director = EngineeringDirector(null)
    val manager = EngineeringManager(director)
    return ProjectLead(manager)

}