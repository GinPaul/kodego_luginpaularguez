package exercises

fun main() {

    //arraylist
    var item = mutableListOf<String>("\n",
        "Bible\n", "Guinness Book of World Records\n", "Nature\n", "Space\n",
        "Britannica Encyclopedia\n",
        "National Geographic Magazine\n",
        "Harvard Business Review\n",
        "Fortune 500 Magazine\n",
        "Wired Magazine\n",
        "People Magazine"
    )

    println("Welcome to the Library.")
    println("Main menu:")
    println("(1) Borrow an item\n(2) Return an item.\n(3) Cancel the transaction")
    println("Please select the number of your transaction:")

    var transactionSelect = readln().toInt()
    var returnedItems = mutableListOf<String>()
    var selectedItems = mutableListOf<String>()
    var borrowAnother: String = ""

    if (transactionSelect == 1) {
        println("Available items in the Library are: $item")
        println("Please select one item to be borrowed:")
        var selectedItem = readln()
        selectedItems.add(selectedItem)
        println("You have selected $selectedItem. Do you want to borrow another book? [Y or N]")
        borrowAnother = readln()

        do {
            if (borrowAnother == "Y") {
                println("Available books are $item:")
                println("Please select one item to be borrowed:")
                selectedItem = readln()
                selectedItems.add(selectedItem)
                println("You have borrowed the following items: $selectedItems.")
                println("Do you wan to borrow another book?. Please type Y for Yes or N for No.")
                var yesOrNo1 = readln()
                if (yesOrNo1 == "Y") {
                } else if (yesOrNo1 == "N") {
                    println("You have borrowed the following items: $selectedItems")
                    println("Thank you for your transaction.")
                    break
                } else if (yesOrNo1 !== "Y" && yesOrNo1 !== "N")
                    println("Invalid input. Choose only Y for Yes or N for No.")
            } else if (borrowAnother == "N") {
                println("Thank you for your transaction.")
                break
            } else if (borrowAnother !== "Y" && borrowAnother !== "N") {
                println("Invalid response. Please select either Y for Yes of N for No.")
            }

        } while (borrowAnother !== "N")

    } else if (transactionSelect == 2) {
        println("Please type the name of the item you would like to return:")
        var itemForReturn = readln()
        returnedItems.add(itemForReturn)
        println("Successfully returned $returnedItems!")
        do {
            println("Do you want to return more items? Please select Y for Yes or N for No.")
            var yesOrNo = readln()
            if (yesOrNo == "Y") {
                println("Please type the name of the item you would like to return:")
                itemForReturn = readln()
                returnedItems.add(itemForReturn)
            } else if (yesOrNo == "N") {
                println("You have returned the following item/s $returnedItems.")
                println("Thank you and come again.")
                break
            } else if (yesOrNo !== "Y" && yesOrNo !== "N") {
                println("Incorrect response. Please type either Y for Yes or N for No.")
            }
        } while (yesOrNo !== "N")

    } else if (transactionSelect == 3) {
        println("The transaction is cancelled.")
        println("Thank you and come again.")
    } else if (transactionSelect !== 1 && transactionSelect !== 2 && transactionSelect !== 3) {
        println("Incorrect response. Please select 1, 2, or 3:")
    }
}

//var encyclopedia = mutableListOf<String>(
////        "Collier's Encyclopedia",
////        "Oxford Encyclopedia",
////        "History Encyclopedia",
////        "Britannica Encyclopedia",
////        "Encyclopedia of Earth",
////        "Encyclopedia of Science Fiction"
////    )
////    var magazines = mutableListOf<String>(
////        "National Geographic Magazine",
////        "Harvard Business Review",
////        "Fortune 500 Magazine",
////        "Wired",
////        "People"
////    )

