package BehavioralDesignPatterns.Iterator

fun main(){
    val iterator = ThemeColor.getIterator()
    while (iterator.hasNext()){
        println(iterator.next().name)
    }
}