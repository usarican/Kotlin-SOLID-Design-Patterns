package StructuralDesignPatterns.Decorator

class TextMessage(
    private val msg : String
) : Message {

    override fun getMessage(): String = msg

}