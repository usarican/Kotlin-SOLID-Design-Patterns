package BehavioralDesignPatterns.NullObject

fun main(){
    val complexService = ComplexService(storage = NullStorageService(), reportName = "Simple Report")
    complexService.generateReport()
}