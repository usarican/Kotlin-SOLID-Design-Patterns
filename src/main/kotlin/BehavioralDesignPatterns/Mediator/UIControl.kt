package BehavioralDesignPatterns.Mediator

/**
 * Collegue
 */
abstract class UIControl {
    abstract fun controlChanged(control : UIControl)
    abstract fun getValue() : String
    abstract fun getName() : String
}