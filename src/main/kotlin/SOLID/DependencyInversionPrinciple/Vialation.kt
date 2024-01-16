package SOLID.DependencyInversionPrinciple

import jdk.jshell.spi.ExecutionControl.NotImplementedException
import kotlin.math.pow

// Senaryoda bir fonksiyon içerisinde calculator kullanıyoruz ve bu calculator toplama işlemi yapıyor.
// Sonrasında ise bu toplama işlemini değiştirip üstünü alma işlemi yapmamız isteniyor.
// mainCalculatorFunction hem First Calculator'a hem de FirstWriter'a bağımlı halde, eğer bir değişiklik yapmak istersek,
// yazdığımız kod içerisinde değişiklik yazmamız gerekir ki bu da yazdığımız testleri bozabilir veya kodun başka yerlerini
// bozabilir.

fun main() {
    mainCalculatorFunction(5,10)
}

fun mainCalculatorFunction(a : Int, b : Int) {
    val calculator = FirstCalculator(a,b)
    val result = calculator.calculate()
    val writer = FirstWriter()
    val msg = writer.write(result)
    println(msg)
}

class FirstCalculator(
    private val a : Int,
    private val b : Int
) {
    fun calculate() = a + b
}
class SecondCalculator(
    private val a : Int,
    private val b : Int
) {
    fun calculate() = a.toDouble().pow(b).toInt()
}

class FirstWriter{
    fun write(a : Int) = "The Calculation Result is = $a"
}
class SecondWriter{
    fun write(a : Int) = "The Result of The Calculation is = $a"
}







