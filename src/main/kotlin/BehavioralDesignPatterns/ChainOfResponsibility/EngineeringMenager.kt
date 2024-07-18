package BehavioralDesignPatterns.ChainOfResponsibility

class EngineeringManager(
    private val nextApprover : LeaveApprover
) : Employee(ENGINEERING_MANAGER,nextApprover) {
    override fun processRequests(leaveApplication: LeaveApplication): Boolean {
        return when(leaveApplication.type){
            LeaveApplicationType.SICK -> {
                leaveApplication.approve(getApproverRole())
                true
            }
            LeaveApplicationType.PTO -> {
                if (leaveApplication.getNoOfDays() <= 5) {
                    leaveApplication.approve(getApproverRole())
                    true
                } else false
            }
            LeaveApplicationType.LOP -> false
        }
    }
}