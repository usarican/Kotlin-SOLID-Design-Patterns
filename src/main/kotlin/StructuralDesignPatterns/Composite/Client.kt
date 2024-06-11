package StructuralDesignPatterns.Composite

fun main(){
    val root1 = createTreeOne()
    root1.ls()
    println("-------------------")
    val root2 = createTreeTwo()
    root2.ls()
}

private fun createTreeOne() : File {
    val file1 = BinaryFile("File 1 ",100)
    val directory = Directory("Directory 1")
    directory.addFile(file1)
    val file2 = BinaryFile("File 2 ",100)
    val file3 = BinaryFile("File 3 ",100)
    val directory2 = Directory("Directory 2")
    directory2.addFile(file2)
    directory2.addFile(file3)
    directory2.addFile(directory)
    return directory2
}
private fun createTreeTwo () : File{
    return BinaryFile("Another File",200)
}