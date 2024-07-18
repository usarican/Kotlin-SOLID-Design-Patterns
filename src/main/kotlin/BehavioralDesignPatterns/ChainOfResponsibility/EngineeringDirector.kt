package BehavioralDesignPatterns.ChainOfResponsibility

class EngineeringDirector(
    private val nextApprover: LeaveApprover?
) : Employee(ENGINEERING_DIRECTOR,nextApprover){
    override fun processRequests(leaveApplication: LeaveApplication): Boolean {
        return when(leaveApplication.type){
            LeaveApplicationType.LOP -> {
                leaveApplication.approve(getApproverRole())
                true
            }
            else -> false
        }
    }
}