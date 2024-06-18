package StructuralDesignPatterns.Proxy

class BitmapImage(
    private val fileName : String,
) : Image {
    private var location : Int? = null

    override fun setLocationPoint(point: Int) {
        this.location = point
    }

    override fun getLocation(): Int? = location

    override fun render() {
        println("Bitmap is rendering from $fileName")
    }
}