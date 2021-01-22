class Milk (_quantity: Double) {
    private val price: Double = 2.0
    private var quantity = _quantity
    var totalPrice =priceCalculator(price, quantity)
}