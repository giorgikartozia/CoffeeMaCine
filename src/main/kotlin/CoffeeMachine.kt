import java.lang.System. `in`
import  java.util.*




class CoffeeMachine (private var scanner: Scanner){

    fun request(): Double {
        println("Please Enter a Coffee Type (Available Types: Latte, Cappuccino)")
        return when (scanner.next()) {
            "latte" ->  Latte(requestSugar(), requestMilk()).price()
            "cappuccino" ->  Cappuccino(requestSugar(), requestMilk(), requestCinnamon()).price()
            else -> {
                println("Unknown Coffee Type")
                return 0.0
            }
        }
    }

    fun orderCoffee() {
        println("Price: ${request()}")
    }

    fun requestSugar(): Double {
        println("Please Enter Sugar Quantity")
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble()
        } else println("Please enter a valid number")
            return 0.0
    }

    fun requestMilk(): Double {
        println("Please Enter Milk Quantity")
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble()
        } else println("Please enter a valid number")
        return 0.0
    }

    fun requestCinnamon(): Boolean {
        println("Do You Want Cinnamon? Y/N")
        return when (scanner.next()) {
            "y" -> true
//            "n" -> false
            else ->  false
        }
    }


}