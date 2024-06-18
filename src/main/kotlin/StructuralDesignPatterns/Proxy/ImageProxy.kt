package StructuralDesignPatterns.Proxy

class ImageProxy(
    private val fileName: String
) : Image {
    private var location: Int? = null
    private var bitmapImage: BitmapImage? = null

    override fun setLocationPoint(point: Int) {
        if (bitmapImage != null) {
            bitmapImage?.setLocationPoint(point)
        } else {
            location = point
        }
    }

    override fun getLocation(): Int? {
        return bitmapImage?.getLocation() ?: location
    }

    override fun render() {
        if (bitmapImage == null) {
            bitmapImage = BitmapImage(fileName)
            if (location != null) {
                bitmapImage!!.setLocationPoint(location!!)
            }
        }
        bitmapImage?.render()
    }
}