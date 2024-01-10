package SOLID.OpenClosePrincipleExample

import kotlin.math.pow

class AreaCalculatorCorrect(
    private val shapeList: List<ShapeC>
) {
    fun sumOfArea(): Double {
        var sumOfArea = 0.0
        shapeList.forEach { shape ->
            sumOfArea += shape.area()
        }
        return sumOfArea
    }
}

interface ShapeC {
    fun area(): Double
}

class CircleCorrect(
    private val radius: Double
) : ShapeC {
    override fun area(): Double = Math.PI * radius.pow(2.0)

}

class SquareCorrect(
    private val length: Double
) : ShapeC {
    override fun area(): Double = length.pow(2.0)

}

class TriangleCorrect(
    private val height: Double,
    private val length: Double
) : ShapeC {
    override fun area(): Double {
        return (height * length) / 2
    }
}