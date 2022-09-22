package practice_activities

fun main(){

    var item = DiscountComputation(0.0)

    item.discounting()

}

class DiscountComputation(amount: Double) {

    init {
        println()
        println("Welcome to the Appliance Store.")
        println("**********************************")
        println()
    }

    fun discounting() {

        print("Enter the product:")
        var itemName: String = ""
        itemName = readln()
        println()



            try {
            print("Enter price:")

            var item1Price: Double = 0.0
            item1Price = readln().toDouble()
            println()
            println("You entered the price Php$item1Price for the $itemName.")
            println()

            var discountFormula1: Double = (item1Price * 0.0)
            var discountFormula2: Double = (item1Price * 0.05)
            var discountFormula3: Double = (item1Price * 0.10)
            var discountFormula4: Double = item1Price * 0.15
            var discountFormula5: Double = item1Price * 0.20

            if ((item1Price >= 0) && (item1Price <= 10000)) {
                println("Discount is Php$discountFormula1")
            } else if ((item1Price >= 10001) && (item1Price <= 20000)) {
                println("Discount is Php$discountFormula2")
            } else if ((item1Price >= 20001) && (item1Price <= 50000)) {
                println("Discount is Php$discountFormula3")
            } else if ((item1Price >= 50001) && (item1Price <= 100000)) {
                println("Discount is Php$discountFormula4")
            } else if ((item1Price > 100000)) {
                println("Discount is Php$discountFormula5")
            } else {
                println("Invalid price!")
            }

            var netPrice1: Double = item1Price * 0.0
            var netPrice2: Double = item1Price * 0.95
            var netPrice3: Double = item1Price * 0.90
            var netPrice4: Double = item1Price * 0.85
            var netPrice5: Double = item1Price * 0.80

            if ((item1Price >= 0) && (item1Price <= 10000)) {
                println("Net Price is $netPrice1")
            } else if ((item1Price >= 10001) && (item1Price <= 20000)) {
                println("Net Price is $netPrice2")
            } else if ((item1Price >= 20001) && (item1Price <= 50000)) {
                println("Net Price is $netPrice3")
            } else if ((item1Price >= 50001) && (item1Price <= 100000)) {
                println("Net Price is $netPrice4")
            } else if ((item1Price > 100000)) {
                println("Net Price is $netPrice5")
            } else {
                println("Invalid price!")
            }
        } catch (e: Exception) {
            println(e.message)
            println("Invalid input. Try again.")
        }
    }
}