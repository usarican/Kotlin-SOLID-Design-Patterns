package BehavioralDesignPatterns.Mediator

/**
 * Concrete Mediator
 */
class UIMediator {
    private val uiControls = mutableListOf<UIControl>()
    fun register(control : UIControl){
        uiControls.add(control)
    }
    fun valueChanged(control: UIControl){
        uiControls.filterNot { c -> c == control }.forEach { c ->
            c.controlChanged(control)
        }
    }

}