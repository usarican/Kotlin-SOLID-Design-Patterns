package BehavioralDesignPatterns.Mediator

/**
 * Concrete Mediator
 */
class Label(
    private val mediator : UIMediator,
    private var text : String
) : UIControl() {

    init {
        mediator.register(this)
    }

    override fun controlChanged(control: UIControl) {
        text = control.getValue()
    }

    override fun getValue(): String {
        return text
    }

    override fun getName(): String {
        return Label::class.java.simpleName
    }
}