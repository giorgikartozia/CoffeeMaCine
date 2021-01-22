class Latte (_quantitySugar: Double, _quantityMilk: Double) {
    private val sugar = _quantitySugar
    private val milk = _quantityMilk
    private val basePrice: Double = 4.0

    fun price(): Double {
        return Sugar(this.sugar).totalPrice + Milk(this.milk).totalPrice + this.basePrice


    }
}