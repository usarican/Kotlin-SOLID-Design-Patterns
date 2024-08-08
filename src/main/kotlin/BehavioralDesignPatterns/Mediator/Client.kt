package BehavioralDesignPatterns.Mediator

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    val mediator = UIMediator()
    val slider = Slider(mediator,10.0)
    val textBox = TextBox(mediator,"text")
    val label = Label(mediator, text = "label")

    val textInput = scanner.nextLine()
    textBox.setValue(textInput)
    println(textBox.getValue())
    println(slider.getValue())
    println(label.getValue())
}