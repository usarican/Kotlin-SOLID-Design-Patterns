package BehavioralDesignPatterns.Command

/**
 * Concrete Command Class
 */
class AdjustVolumeCommand(
    private val device : Device,
    private val volume : Int
) : Command{
    override fun execute() {
        device.changeTheVolume(volume)
    }
}