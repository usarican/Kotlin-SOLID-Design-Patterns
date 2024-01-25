package CreationalDesignPatterns.Singleton

class LazySingleton private constructor() {

    var instanceNum = 0
    companion object {
        @Volatile private var INSTANCE : LazySingleton? = null
        fun getInstance() : LazySingleton {
           if (INSTANCE == null) {
               synchronized(LazySingleton){
                   if (INSTANCE == null){
                       INSTANCE = LazySingleton()
                   }
               }
           }
            return INSTANCE as LazySingleton
        }
    }
}