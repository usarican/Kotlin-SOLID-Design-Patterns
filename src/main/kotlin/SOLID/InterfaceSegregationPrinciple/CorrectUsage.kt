package SOLID.InterfaceSegregationPrinciple

// Eğer interface'i 1 sınıf kullanıyorsa, o methodu interface içerisine değil de class içerisine yazabiliriz.
// Birden fazla class kullanıp başka classlar kullanmıyorsa interface'i bölmek daha mantıklıdır.

fun main() {
    val userPersistenceService = UserPersistenceService()
    val orderPersistenceService = OrderPersistenceService()

    val order = Order(1)
    val user = User("A",1)

    userPersistenceService.save(user)
    orderPersistenceService.save(order)

    println(UserPersistenceService.mutableUserList)
    println(OrderPersistenceService.mutableOrderList)


}

interface EntityC

interface PersistenceServiceC<T : Entity> {
    fun save(entity : T)
    fun delete(entity : T)
    fun findById(id : Int) : T?
}

data class UserC(
    val userName : String,
    val userId : Int,

    ) : EntityC

data class OrderC(
    val orderId : Int
) : EntityC{

}

class UserPersistenceServiceC : PersistenceServiceC<User> {

    companion object {
        val mutableUserList : MutableMap<Int,User> = mutableMapOf()
    }
    override fun save(entity: User) {
        mutableUserList[entity.userId] = entity
    }

    override fun delete(entity: User) {
        mutableUserList.remove(entity.userId)
    }

    override fun findById(id: Int): User? {
        return mutableUserList[id]
    }

    fun findByName(name: String): User? {
        return mutableUserList.values.find { it.userName == name }
    }

}

class OrderPersistenceServiceC : PersistenceServiceC<Order> {
    companion object {
        val mutableOrderList : MutableMap<Int,Order> = mutableMapOf()
    }
    override fun save(entity: Order) {
        mutableOrderList[entity.orderId] = entity
    }

    override fun delete(entity: Order) {
        mutableOrderList[entity.orderId] = entity
    }

    override fun findById(id: Int): Order? {
        return mutableOrderList[id]
    }

}