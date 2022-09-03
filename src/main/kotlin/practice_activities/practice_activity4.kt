package practice_activities

fun main(){
    println()

    println("Enter product:")
    var itemName : String = readln()

    println("Enter price:")
    var item1Regprice = readln().toInt()
    println("Price of the $itemName is $item1Regprice")

    //discount computation
    var discountFormula1: Double =(item1Regprice* 0.0)
    var discountFormula2: Double =(item1Regprice*0.05)
    var discountFormula3: Double =(item1Regprice*0.10)
    var discountFormula4: Double =(item1Regprice*0.15)
    var discountFormula5: Double =(item1Regprice*0.20)

    if((item1Regprice >= 0)&&(item1Regprice <= 10000)){
        println("Discount is $discountFormula1")
    }else if((item1Regprice >=10001)&&(item1Regprice <=20000)){
        println("Discount is $discountFormula2")
    }else if ((item1Regprice >=20001)&&(item1Regprice <=50000)){
        println("Discount is $discountFormula3")
    }else if ((item1Regprice >=50001)&&(item1Regprice <=100000)){
        println("Discount is $discountFormula4")
    }else if ((item1Regprice > 100000)){
        println("Discount is $discountFormula5")
    }else{
        println("Invalid price!")
    }




}