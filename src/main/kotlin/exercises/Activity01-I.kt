package exercises

fun main(){

    var noodles = mapOf("Lucky Me Beef" to 10, "Lucky Me Pancit Canton" to 5, "Nissin Cup Noodles" to 7)
    var freshVegetables = mapOf("Alugbati" to 5, "Okra" to 2, "Squash" to 3)
    var nonFood = mapOf("Surf Sunfresh Powder" to 1, "Zonrox Bleach Original" to 8, "Downy Antibac" to 6)
    var optionSelection: Int = 0

    println("Welcome to the grocery store!")
    println()
    println("Choose option:")
    println("[1] Show list of available items")
    println("[2] Update inventory")
    println("[3] Exit")

    println("Please select an option:")
    optionSelection = readln().toInt()

    if (optionSelection == 1){
        println("Noodles:")
        println ("$noodles")

        println("Fresh Vegetables:")
        println("$freshVegetables")

        println("Non-food items:")
        println("$nonFood")
    }else if (optionSelection == 2){
        println("Please choose which category you want to update the inventory:")
    }




}