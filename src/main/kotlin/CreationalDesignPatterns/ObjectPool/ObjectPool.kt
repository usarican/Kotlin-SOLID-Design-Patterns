package CreationalDesignPatterns.ObjectPool

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

class ObjectPool <T : Poolable> {
    private val availablePool : BlockingQueue<T> = LinkedBlockingQueue()

    fun get() : T? {
        return try {
            availablePool.take()
        }catch (e : java.lang.Exception){
            println("Error occurs.. $e")
            null
        }
    }

    fun insert(obj: T) {
        try {
            availablePool.add(obj)
        }catch (e : InterruptedException){
            println("Error occurs..")
        }
    }

    fun release(obj : T){
        obj.reset()
        try {
            availablePool.offer(obj)
        }catch (e : InterruptedException){
            println("Error occurs..")
        }
    }
}