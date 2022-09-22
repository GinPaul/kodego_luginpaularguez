package practice_activities

fun main(){

    println("Welcome to the discount store.")
    var item = DiscountComputation(0.0)

    item.discounting()

}

class DiscountComputation(amount: Double){
    var itemName : String = ""
    var item1Regprice: Double = 0.0
    var discountFormula1: Double = item1Regprice* 0.0
    var discountFormula2: Double = item1Regprice*0.05
    var discountFormula3: Double = item1Regprice*0.10
    var discountFormula4: Double = item1Regprice*0.15
    var discountFormula5: Double = item1Regprice*0.20
    var netPrice1: Double = item1Regprice*0.0
    var netPrice2: Double = item1Regprice*0.95
    var netPrice3: Double = item1Regprice*0.90
    var netPrice4: Double = item1Regprice*0.85
    var netPrice5: Double = item1Regprice*0.80

    init{
        println("Welcome to the discount calculator.")
    }

    fun discounting(){

        println("Enter product:")
        itemName = readln()

        println("Enter price:")
        item1Regprice = readln().toDouble()
        println("Price of the $itemName is $item1Regprice.")

        if ((item1Regprice >= 0) && (item1Regprice <= 10000)) {
            println("Discount is $discountFormula1")
        } else if ((item1Regprice >= 10001) && (item1Regprice <= 20000)) {
            println("Discount is $discountFormula2")
        } else if ((item1Regprice >= 20001) && (item1Regprice <= 50000)) {
            println("Discount is $discountFormula3")
        } else if ((item1Regprice >= 50001) && (item1Regprice <= 100000)) {
            println("Discount is $discountFormula4")
        } else if ((item1Regprice > 100000)) {
            println("Discount is $discountFormula5")
        } else {
            println("Invalid price!")
        }

        if ((item1Regprice >= 0) && (item1Regprice <= 10000)) {
            println("Net Price is $netPrice1")
        } else if ((item1Regprice >= 10001) && (item1Regprice <= 20000)) {
            println("Net Price is $netPrice2")
        } else if ((item1Regprice >= 20001) && (item1Regprice <= 50000)) {
            println("Net Price is $netPrice3")
        } else if ((item1Regprice >= 50001) && (item1Regprice <= 100000)) {
            println("Net Price is $netPrice4")
        } else if ((item1Regprice > 100000)) {
            println("Net Price is $netPrice5")
        } else {
            println("Invalid price!")
        }
    }

}