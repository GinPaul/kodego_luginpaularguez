package practice_activities

import kotlin.math.roundToInt

var item1Price: Double = 0.0

fun main() {

    var item = DiscountComputation(0.0)

    print("Enter the product:")
    var itemName: String = ""
    itemName = readln()
    println()
//    var item1Price: Double = 0.0

    do{
        try {
            print("Enter price:")
            item1Price = readln().toDouble()
            println()
            println("You entered the price Php$item1Price for the ${itemName.uppercase()}.")
            println()
            break
        } catch (e: NumberFormatException) {
            println(e)
            println("Invalid input. Try again.")
            println()
        }
    }while (true)

    item.discounting()
    item.netPriceComputation()
    println()
    println("Thank you for using the service.")
    println("**********************************")


}
class DiscountComputation(item1Price: Double) {
    init {
        println()
        println("Welcome to the Appliance Store.")
        println("**********************************")
        println()
    }


    fun discounting(): Double {

        var discountFormula1: Double = (item1Price * 0.0)
        var discountFormula2: Double = (item1Price * 0.05)
        var discountFormula3: Double = (item1Price * 0.10)
        var discountFormula4: Double = item1Price * 0.15
        var discountFormula5: Double = item1Price * 0.20


        //to loop after try-catch block for string input or negative number
//          //discount computation
        if ((item1Price >= 0) && (item1Price <= 10000)) {
            println("Discount is Php $discountFormula1")
            return discountFormula1
        } else if ((item1Price >= 10001) && (item1Price <= 20000)) {
            println("Discount is Php$discountFormula2")
            return discountFormula2
        } else if ((item1Price >= 20001) && (item1Price <= 50000)) {
            println("Discount is Php$discountFormula3")
            return discountFormula3
        } else if ((item1Price >= 50001) && (item1Price <= 100000)) {
            println("Discount is Php$discountFormula4")
            return discountFormula4
        } else if ((item1Price > 100000)) {
            println("Discount is Php$discountFormula5")
            return discountFormula5
        } else {
            println("Discount computation error: Invalid price!")
            return 0.0
        }
    }

    fun netPriceComputation(): Double {
        var netPrice1: Double = item1Price * 0.0
        var netPrice2: Double = item1Price * 0.95
        var netPrice3: Double = item1Price * 0.90
        var netPrice4: Double = item1Price * 0.85
        var netPrice5: Double = item1Price * 0.80

        //net price computation
        if ((item1Price >= 0) && (item1Price <= 10000)) {
            println("Net Price is Php$netPrice1")
            return netPrice1
        } else if ((item1Price >= 10001) && (item1Price <= 20000)) {
            println("Net Price is Php$netPrice2")
            return netPrice2
        } else if ((item1Price >= 20001) && (item1Price <= 50000)) {
            println("Net Price is Php$netPrice3")
            return netPrice3
        } else if ((item1Price >= 50001) && (item1Price <= 100000)) {
            println("Net Price is Php$netPrice4")
            return netPrice4
        } else if ((item1Price > 100000)) {
            println("Net Price is Php$netPrice5")
            return netPrice5

        } else {
            println("Net price computation error: Invalid price!")
            println("Try again.")
            println()
            return 0.0
        }

    }
}




