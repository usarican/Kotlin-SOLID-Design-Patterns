package BehavioralDesignPatterns.Command

fun main(){
    val device = Device()
    val remoteControl = RemoteControl()

    val turnOnDeviceCommand = TurnOnCommand(device)
    remoteControl.addCommand(turnOnDeviceCommand)
    val changeChannelCommand = ChangeChannelCommand(device,"ATV")
    val adjustVolumeCommand = AdjustVolumeCommand(device, volume = 25)
    remoteControl.addCommand(changeChannelCommand,adjustVolumeCommand)
    val turnOffDeviceCommand = TurnOffCommand(device)
    remoteControl.addCommand(turnOffDeviceCommand)

}