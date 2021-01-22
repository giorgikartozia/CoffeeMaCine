class Cinnamon (_wish: Boolean) {
    private val price: Double = 3.0
    private var wish = _wish
    fun price(): Double {
        if (this.wish) return price
        else return 0.0
    }
}