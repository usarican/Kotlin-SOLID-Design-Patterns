package StructuralDesignPatterns.Proxy

fun main(){
    val image = ImageFactory.getImage("File One")
    image.setLocationPoint(10)
    println("Get Image Location ${image.getLocation()}")
    image.render()
}