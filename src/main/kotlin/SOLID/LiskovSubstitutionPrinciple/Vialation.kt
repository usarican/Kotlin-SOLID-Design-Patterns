package SOLID.LiskovSubstitutionPrinciple

// Rectangle Square Problemi, Bakıldığı zaman kare iki köşesi de aynı olan bir dikdörtgen. Matematiksel olarak doğru fakat
// Programlama dilinde özellikle OOP'de hatalara sebep olabilir.

// Buradaki hata aslında rectangle base class'ının değişmemesi gereken özelliğini değiştirerek var olan davranışı değiştiriyoruz.
// Bu şekilde aslında liskov'un substitution yasasını bozmuş oluyoruz. Bunu düzeltmek için ne kadar matematiksel olsa da
// Override edip davranışlarını bozacağımız classları birbiri ile direkt olarak ilişkilendirmiyoruz.

fun main() {

    val rectangle = Rectangle(10,20)
    println(rectangle.calculateArea())
    val square = Square(10)
    println(square.calculateArea())

    useRectangle(rectangle)
    useRectangle(square)

}

fun useRectangle(rectangle: Rectangle) {
    rectangle.setWidth(20)
    rectangle.setHeight(30)
    if(rectangle.getHeight() != 30) {
        throw Exception("Height does not 30")
    }
    if(rectangle.getWidth() != 20) {
        throw Exception("Width does not 20")
    }

}

open class Rectangle(private var height: Int, private var width: Int) {
    open fun setWidth(width: Int) {
        this.width = width
    }
    open fun getWidth() = this.width

    open fun setHeight(height: Int) {
        this.height = height
    }
    open fun getHeight() = this.height

    open fun calculateArea() = width * height
}

class Square(private var side : Int) : Rectangle(side,side){
    override fun setHeight(height: Int) {
        setSide(height)
    }

    override fun setWidth(width: Int) {
        setSide(width)
    }

    fun setSide(side : Int){
        super.setWidth(side)
        super.setHeight(side)
    }

}