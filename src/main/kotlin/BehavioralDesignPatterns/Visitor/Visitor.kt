package BehavioralDesignPatterns.Visitor

interface Visitor {
    fun visit(programmer: Programmer)
    fun visit(lead: ProjectLead)
    fun visit(manager: Manager)
    fun visit(cto: CTO)
}