package exercises

fun main(){
    println()
    var instruction1 : String = "Available items for today:"
    var item1 : String = "Encyclopedia"
    var characteristic1 : String = "will give you introductory information to help you broaden or narrow your topic, while also providing keywords and terms needed to conduct further research."
    var item2 : String = "Magazine"
    var item3 : String = "Newspaper"
    var item4 : String = "Audio Book"
    var item5 : String = "CD"

    println("$instruction1")
    println("Library Item 1: $item1")
    println("Library Item 2: $item2")
    println("Library Item 3: $item3")
    println("Library Item 4: $item4")
    println("Library Item 5: $item5")

    println()

    println("Which item you want to borrow?")
    var prompt : String = readln()
    println()
    println("$prompt $characteristic1")
    println()
    println("Are you sure you want to borrow this item?")
    var prompt2 : String = readln()
    println()
    println("You have confirmed to borrow $prompt. Please get your slip and proceed to the counter.")
    println()
}