package StructuralDesignPatterns.Proxy

class ImageFactory {

    companion object {
        fun getImage(fileName : String) : Image = ImageProxy(fileName)
    }

}