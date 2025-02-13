package BehavioralDesignPatterns.NullObject

open class StorageService {
    open fun save(report: Report){
        println("Writing report out")
        Thread.sleep(1000L)
        println("The ${report.reportName} is written.")
    }
}