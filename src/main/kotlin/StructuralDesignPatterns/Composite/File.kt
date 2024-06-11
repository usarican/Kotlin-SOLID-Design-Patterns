package StructuralDesignPatterns.Composite

// Component Interface
abstract class File(
) {

    open var name : String
        get() = name
        set(value) { name = value }

    open var permission : String
        get() = permission
        set(value) { permission = value }

    abstract fun addFile(file : File)
    abstract fun getFiles() : List<File>
    abstract fun removeFile(file: File) : Boolean
    abstract fun ls()



}