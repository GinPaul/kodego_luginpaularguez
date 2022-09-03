package exercises

fun main(){
    println()
    var instruction1 : String = "Available items for today:"
    var item1 : String = "Encyclopedia"
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
    println("Please proceed to the counter and show your slip for the $prompt")

}