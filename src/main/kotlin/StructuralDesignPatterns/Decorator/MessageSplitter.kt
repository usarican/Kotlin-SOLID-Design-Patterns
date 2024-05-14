package StructuralDesignPatterns.Decorator

class MessageSplitter(
    private val message : Message
) : Message{
    override fun getMessage(): String = message.getMessage().split("-")[0]
}