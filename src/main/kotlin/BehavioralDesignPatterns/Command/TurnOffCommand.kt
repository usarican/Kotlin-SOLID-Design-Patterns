package BehavioralDesignPatterns.Command

/**
 * Concrete Command Class
 */
class TurnOffCommand(
    private val device : Device
) : Command {
    override fun execute() {
        device.turnOff()
    }
}