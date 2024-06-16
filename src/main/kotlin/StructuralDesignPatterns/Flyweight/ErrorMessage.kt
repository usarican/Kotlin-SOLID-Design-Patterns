package StructuralDesignPatterns.Flyweight

/**
 * Flyweight
 */
interface ErrorMessage {
    fun getText(errorCode : Int?) : String
}