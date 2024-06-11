package StructuralDesignPatterns.Composite

// Leaf
class BinaryFile(
    override var name : String,
    private val size : Int
) : File() {

    override fun addFile(file: File) {
        throw UnsupportedOperationException("Node Leaf does not support this operation")
    }

    override fun getFiles(): List<File> {
        throw UnsupportedOperationException("Node Leaf does not support this operation")
    }

    override fun removeFile(file: File): Boolean {
        throw UnsupportedOperationException("Node Leaf does not support this operation")
    }

    override fun ls() {
        println("File Name = $name Size = $size")
    }
}