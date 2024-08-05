package BehavioralDesignPatterns.Command

/**
 * Concrete Command Class
 */
class ChangeChannelCommand(
    private val device: Device,
    private val channel : String
) : Command {

    override fun execute() {
        device.changeTheChannel(channel)
    }
}