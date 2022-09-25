import mu.KotlinLogging
private val logger = KotlinLogging.logger {}


var num1: Int = 0
var num2: Int = 0
var total = num1 + num2
var inputText: String = ""
var divisor: Int = 1
var finalAmount: Int = total / divisor

fun main() {

    var finalAnswer = OperationSumAndDivision(0)

    //step 1 with try catch for invalid input
    try {
        println("Please enter an amount:")
        num1 = readln().toInt()
    } catch (e: NumberFormatException) {
        println(e)
        println("Invalid input. Try again.")
        println()
    }

    //step 2: amount entry and operation loop
    do {
        print("Do you want to add an amount?")
        print("Please enter Y for Yes and N for No:")
        inputText = readln().uppercase()

        //try catch here
        if (inputText == "Y") {
            do {
                try {
                    println("Enter the amount:")
                    num2 = readln().toInt()
                } catch (e: NumberFormatException) {
                    println(e)
                    println("Invalid input. Try again.")
                }
            } while (false)
            println("The amount you entered is $num2")
        } else if (inputText == "N") {
            break
        } else
            println("Invalid input. Please try again.")
    } while (inputText !== "N")


    //step 3: call the addition function
    finalAnswer.addition()

    //step 4: divisor input
    println("Divide the total amount by how much?")
    divisor = readln().toInt()

    //step 5: call the division function
    finalAnswer.division()

    //end
    println()
    println("Thank you for using the service.")

}
class OperationSumAndDivision (amount: Int) {
    init {
        println("Object created!")
        println("Welcome.")
        println()
    }

    fun addition(): Int {
        num1 += num2
        println("The total amount you entered is $num1")
        println()
        return num1
    }

    fun division(): Int {
        finalAmount = num1 / divisor
        println("The final answer is $finalAmount")
        return finalAmount
    }
}
