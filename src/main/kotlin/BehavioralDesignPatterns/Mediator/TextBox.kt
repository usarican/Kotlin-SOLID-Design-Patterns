package BehavioralDesignPatterns.Mediator

/**
 * Concrete Mediator
 */
class TextBox(
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

    fun setValue(text : String){
        this.text = text
        mediator.valueChanged(this)
    }

    override fun getName(): String {
       return TextBox::class.java.simpleName
    }
}