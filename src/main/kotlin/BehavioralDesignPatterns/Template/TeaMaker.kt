package BehavioralDesignPatterns.Template

class TeaMaker : BeverageMaker() {
    override fun brew() {
        println("Tea Brewing...")
    }
}