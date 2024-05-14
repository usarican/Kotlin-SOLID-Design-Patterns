package StructuralDesignPatterns.Decorator

fun main(){
    val text = "UTKU - SARICAN"
    val message = TextMessage(text)
    println(message.getMessage())

    val decoratorMessage = MessageSplitter(message)
    println(decoratorMessage.getMessage())
}