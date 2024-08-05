package BehavioralDesignPatterns.ChainOfResponsibility

class ProjectLead(
    private val successor : LeaveApprover
) : Employee(PROJECT_LEAD,successor) {
    override fun processRequests(leaveApplication: LeaveApplication): Boolean {
        if (leaveApplication.type != LeaveApplicationType.SICK) return false
        if (leaveApplication.getNoOfDays() > 2) return false
        return true
    }
}