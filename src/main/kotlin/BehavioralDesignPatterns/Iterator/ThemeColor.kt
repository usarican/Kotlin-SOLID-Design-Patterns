package BehavioralDesignPatterns.Iterator

enum class ThemeColor {
    RED,ORANGE,BLACK,WHITE;

    companion object {
        fun getIterator() : Iterator<ThemeColor> =
            ThemeColorIterator
    }

    private object ThemeColorIterator : Iterator<ThemeColor> {
        private var position = 0
        override fun next(): ThemeColor {
            return ThemeColor.values()[position++]
        }

        override fun hasNext(): Boolean {
            return position < ThemeColor.values().size
        }

    }
}