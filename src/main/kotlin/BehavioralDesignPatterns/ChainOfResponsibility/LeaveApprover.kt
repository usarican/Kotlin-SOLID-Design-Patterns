package BehavioralDesignPatterns.ChainOfResponsibility

interface LeaveApprover {
    fun processLeaveApplication(leaveApplication : LeaveApplication)
    fun getApproverRole() : String
}