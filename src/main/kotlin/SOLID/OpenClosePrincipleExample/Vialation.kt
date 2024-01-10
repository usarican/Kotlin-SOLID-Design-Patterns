package SOLID.OpenClosePrincipleExample

import kotlin.math.pow

class AreaCalculator(
    private val shapeList : List<Shape>
) {
    fun sumOfArea() : Double {
        var sumOfArea = 0.0
        shapeList.forEach {shape ->
            when(shape) {
                is Circle -> {
                    sumOfArea += Math.PI * shape.radius.pow(2.0)
                }
                is Square -> {
                    sumOfArea += shape.length.pow(2.0)
                }
            }
        }
        return sumOfArea
    }
}

interface Shape {

}

class Circle(
    val radius : Double
) : Shape {

}
class Square(
    val length : Double
) : Shape {

}