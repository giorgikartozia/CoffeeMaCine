class Cappuccino(_quantitySugar: Double, _quantityMilk: Double, _cinnamon: Boolean) {
    private val sugar = _quantitySugar
    private val milk = _quantityMilk
    private val cinnamon = _cinnamon
    private val basePrice: Double = 5.0

    fun price(): Double {
        return Sugar(this.sugar).totalPrice + Milk(this.milk).totalPrice+Cinnamon(this.cinnamon).price() + this.basePrice
    }
}