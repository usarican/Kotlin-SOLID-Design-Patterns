package SOLID.InterfaceSegregationPrinciple

import jdk.jshell.spi.ExecutionControl.NotImplementedException


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

interface Entity

interface PersistenceService<T : Entity> {
    fun save(entity : T)
    fun delete(entity : T)
    fun findById(id : Int) : T?
    fun findByName(name : String) : T?
}

data class User(
    val userName : String,
    val userId : Int,

) : Entity

data class Order(
    val orderId : Int
) : Entity {

}

class UserPersistenceService : PersistenceService<User> {

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

    override fun findByName(name: String): User? {
        return mutableUserList.values.find { it.userName == name }
    }

}

class OrderPersistenceService : PersistenceService<Order> {
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

    override fun findByName(name: String): Order {
        throw NotImplementedException("Order Does Not Support This Method..")
    }

}







