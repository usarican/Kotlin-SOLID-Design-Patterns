package CreationalDesignPatterns.SimpleFactory

class CheesePizza : Pizza {
    override fun bake() {
        println("${CheesePizza::class.simpleName} is baked.")
    }

}

class VeggiePizza : Pizza {
    override fun bake() {
        println("${VeggiePizza::class.simpleName} is baked.")
    }

}

class PepperoniPizza : Pizza {
    override fun bake() {
        println("${PepperoniPizza::class.simpleName} is baked.")
    }

}