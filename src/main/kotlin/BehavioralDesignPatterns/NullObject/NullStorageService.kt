package BehavioralDesignPatterns.NullObject

class NullStorageService : StorageService() {
    override fun save(report: Report) {
        println("Null object save method. Doing nothing..")
    }
}