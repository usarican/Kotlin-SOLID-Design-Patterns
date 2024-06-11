package StructuralDesignPatterns.Composite

// Composite
class Directory(
    override var name: String
) : File() {
    private val fileList = mutableListOf<File>()

    override fun addFile(file: File) {
        fileList.add(file)
    }

    override fun getFiles(): List<File> {
        return fileList
    }

    override fun removeFile(file: File): Boolean {
        return fileList.remove(file)
    }

    override fun ls() {
        println("Directory Name = $name")
        fileList.forEach(File::ls)
    }
}