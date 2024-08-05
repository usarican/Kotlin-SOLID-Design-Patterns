package BehavioralDesignPatterns.Command

/**
 *  Receiver Class
 */
class Device {

    private var currentChannel : String = "Kanal D"
    private var currentVolume : Int = 0

    fun turnOn(){
        println("Device Opened.\nThe channel $currentChannel\nThe Volume $currentVolume\n")
    }
    fun turnOff(){
        println("Device Closed.")
    }
    fun changeTheChannel(newChannel : String){
        currentChannel = newChannel
        println("Channel Changed.\nThe new channel is $currentChannel")
    }
    fun changeTheVolume(newVolume : Int){
        if (newVolume < currentVolume){
            println("Volume dropped.\nThe new volume is $newVolume")
        } else {
            println("Volume increased.\nThe new volume is $newVolume")
        }
        currentVolume = newVolume
    }
}