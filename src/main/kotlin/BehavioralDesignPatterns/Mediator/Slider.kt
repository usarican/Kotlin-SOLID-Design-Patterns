package BehavioralDesignPatterns.Mediator

/**
 * Concrete Collegue
 */
class Slider(
    private val mediator : UIMediator,
    private var slideValue : Double
) : UIControl() {

    init {
        mediator.register(this)
    }

    override fun controlChanged(control: UIControl) {
        slideValue = control.getValue().toDouble()
    }

    override fun getValue(): String {
        return slideValue.toString()
    }

    override fun getName(): String {
        return Slider::class.java.simpleName
    }
}