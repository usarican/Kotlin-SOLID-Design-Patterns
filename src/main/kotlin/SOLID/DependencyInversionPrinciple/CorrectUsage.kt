package SOLID.DependencyInversionPrinciple

import kotlin.math.pow

// Yapılması gereken çözüm fonksiyonu daha bağımsız hale getirip, bağımlılıkları abstraction ile kurtarmaktır.

fun main() {
    // Bu şekilde hem fonksiyonumuzu rahatlattık hem de bağımlılıktan kurtarmış olduk.
    mainCalculatorFunctionC(FirstCalculatorC(5,10),FirstWriterC())
    mainCalculatorFunctionC(SecondCalculatorC(5,10),SecondWriterC())
}

fun mainCalculatorFunctionC(calculator: Calculator, writer: Writer) {
    val result = calculator.calculate()
    val msg = writer.write(result)
    println(msg)
}

// Abstraction için interface'ler oluşturuyoruz.

interface Calculator {
    fun calculate() : Int
}

interface Writer {
    fun write(a : Int) : String
}

class FirstCalculatorC(
    private val a : Int,
    private val b : Int
) : Calculator {
    override fun calculate() = a + b
}
class SecondCalculatorC(
    private val a : Int,
    private val b : Int
) : Calculator {
    override fun calculate() = a.toDouble().pow(b).toInt()
}

class FirstWriterC : Writer {
    override fun write(a : Int) = "The Calculation Result is = $a"
}
class SecondWriterC : Writer {
    override fun write(a : Int) = "The Result of The Calculation is = $a"
}