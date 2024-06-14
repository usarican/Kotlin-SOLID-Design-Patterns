package StructuralDesignPatterns.Facade

fun main(){
    val customer1 = Customer("Jack",1000.0)
    val customer2 = Customer("Bob",2000.0)
    val product = Product("PlayStation 5",1001.0,true)
    val product2 = Product("PlayStation 1",9999.0,false)

    val orderFacade = OrderFacade(customer1,product)
    val orderFacade2 = OrderFacade(customer2,product)
    val orderFacade3 = OrderFacade(customer2,product2)

    orderFacade.buyProduct()
    println("------------------------------")
    orderFacade2.buyProduct()
    println("------------------------------")
    orderFacade3.buyProduct()


}