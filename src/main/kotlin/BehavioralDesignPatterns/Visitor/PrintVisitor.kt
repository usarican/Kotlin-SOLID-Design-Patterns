package BehavioralDesignPatterns.Visitor

class PrintVisitor : Visitor {
    override fun visit(programmer: Programmer) {
        println("${programmer.name} is a ${programmer.skill} programmer.")
    }

    override fun visit(lead: ProjectLead) {
        println("${lead.name} is a Project Lead with ${lead.getDirectReports().size} programmers reporting.")
    }

    override fun visit(manager: Manager) {
        println("${manager.name} is a Manager with ${manager.getDirectReports().size} leads reporting.")
    }

    override fun visit(cto: CTO) {
        println("${cto.name} is a CTO with ${cto.getDirectReports().size} managers reporting.")
    }
}