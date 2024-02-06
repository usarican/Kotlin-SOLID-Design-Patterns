package CreationalDesignPatterns.ObjectPool

fun main(){
    val defaultBitmap1 = Bitmap(bitmapName = "bit.map")
    val defaultBitmap2 = Bitmap(bitmapName = "bit.img")

    bitmapPool.insert(defaultBitmap1)
    bitmapPool.insert(defaultBitmap2)

    val pooledBitmap = bitmapPool.get()
    val pooledBitmap2 = bitmapPool.get()
    pooledBitmap?.setLocation(Location(10,40))
    pooledBitmap2?.setLocation(Location(30,20))

    pooledBitmap?.draw()
    pooledBitmap2?.draw()

    pooledBitmap?.let { bitmapPool.release(pooledBitmap) }
    val pooledBitmap3 = bitmapPool.get()

    pooledBitmap3?.draw()
    val pooledBitmap4 = bitmapPool.get()
    pooledBitmap4?.draw()

}

val bitmapPool = ObjectPool<Bitmap>()