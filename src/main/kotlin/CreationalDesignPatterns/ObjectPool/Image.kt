package CreationalDesignPatterns.ObjectPool

interface Image : Poolable {
    fun draw()
    fun getLocation() : Location?
    fun setLocation(location : Location)
}