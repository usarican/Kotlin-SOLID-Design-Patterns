package BehavioralDesignPatterns.Command

/**
 * Concrete Command Class
 */
class TurnOnCommand(
    private val device : Device
) : Command {
    override fun execute() {
        device.turnOn()
    }
}