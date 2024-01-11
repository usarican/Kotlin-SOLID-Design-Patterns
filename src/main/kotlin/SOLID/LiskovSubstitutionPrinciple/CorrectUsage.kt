package SOLID.LiskovSubstitutionPrinciple

import kotlin.math.pow

// Rectangle Square Problemi, Bakıldığı zaman kare iki köşesi de aynı olan bir dikdörtgen. Matematiksel olarak doğru fakat
// Programlama dilinde özellikle OOP'de hatalara sebep olabilir.

// Buradaki hata aslında rectangle base class'ının değişmemesi gereken özelliğini değiştirerek var olan davranışı değiştiriyoruz.
// Bu şekilde aslında liskov'un substitution yasasını bozmuş oluyoruz. Bunu düzeltmek için ne kadar matematiksel olsa da
// Override edip davranışlarını bozacağımız classları birbiri ile direkt olarak ilişkilendirmiyoruz.

fun main() {

    val rectangle = RectangleC(10,20)
    println(rectangle.calculateArea())
    val square = SquareC(10)
    println(square.calculateArea())

    useRectangleC(rectangle)

}

fun useRectangleC(rectangleC: RectangleC) {
    rectangleC.setWidth(20)
    rectangleC.setHeight(30)
    if(rectangleC.getHeight() != 30) {
        throw Exception("Height does not 30")
    }
    if(rectangleC.getWidth() != 20) {
        throw Exception("Width does not 20")
    }

}

interface Shape {
    fun calculateArea() : Int
}

class RectangleC(private var height: Int, private var width: Int) : Shape {
    fun setWidth(width: Int) {
        this.width = width
    }
    fun getWidth() = this.width

    fun setHeight(height: Int) {
        this.height = height
    }
    fun getHeight() = this.height

    override fun calculateArea() = width * height
}

class SquareC(private var side : Int) : Shape{

    fun setSide(side : Int){
        this.side = side
    }

    fun getSide() = this.side

    override fun calculateArea(): Int = side.toDouble().pow(2).toInt()

}