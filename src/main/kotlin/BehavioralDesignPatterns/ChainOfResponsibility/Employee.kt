package BehavioralDesignPatterns.ChainOfResponsibility

abstract class Employee(private val role: String, private val successor: LeaveApprover?) : LeaveApprover {
    override fun processLeaveApplication(leaveApplication: LeaveApplication) {
        if (!processRequests(leaveApplication)){
            successor?.processLeaveApplication(leaveApplication)
        }
    }

    protected abstract fun processRequests(leaveApplication: LeaveApplication) : Boolean

    override fun getApproverRole(): String {
        return role
    }
}