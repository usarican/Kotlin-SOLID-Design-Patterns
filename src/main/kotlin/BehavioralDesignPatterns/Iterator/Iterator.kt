package BehavioralDesignPatterns.Iterator

interface Iterator<T : Any?> {
    fun next() : T
    fun hasNext() : Boolean
}