package BehavioralDesignPatterns.NullObject

class ComplexService(
    private val storage : StorageService,
    private val reportName : String
) {

    fun generateReport() {
        println("Starting a complex report build!")
        Thread.sleep(3000L)
        println("Done with Report")
        storage.save(Report(reportName = reportName))
    }
}