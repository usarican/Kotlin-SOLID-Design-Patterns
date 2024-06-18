package StructuralDesignPatterns.Proxy

interface Image {
    fun setLocationPoint(point : Int)
    fun getLocation() : Int?
    fun render()
}