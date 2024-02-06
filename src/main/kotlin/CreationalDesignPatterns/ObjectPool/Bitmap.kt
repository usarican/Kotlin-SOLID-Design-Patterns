package CreationalDesignPatterns.ObjectPool

class Bitmap(
    private var location: Location? = null,
    private val bitmapName: String
) : Image {
    override fun draw() {
        println("Drawing $bitmapName @ $location")
    }

    override fun getLocation(): Location? = location

    override fun setLocation(location: Location) {
        this.location = location
    }

    override fun reset() {
        this.location = null
        println("Reseting $bitmapName...")
    }
}