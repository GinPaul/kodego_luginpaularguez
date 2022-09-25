import mu.KotlinLogging
private val logger = KotlinLogging.logger {}


var num1: Int = 0
var num2: Int = 0
var total: Int = 0
var total2: Int = 0
var total3: Int = 0
var inputText: String = ""
var divisor: Int = 1
var finalAmount: Int = total / divisor

fun main() {

    var finalAnswer = OperationSumAndDivision()

    //step 1 with try catch for invalid input
    do{
        try {
            println("Please enter an amount:")
            num1 = readln().toInt()
            break
        } catch (e: NumberFormatException) {
            println(e)
            println("Invalid input. Try again.")
            println()
        }
    }while(true)

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
class OperationSumAndDivision() {
    init {
        println("Object created!")
        println("Welcome.")
        println()
    }

    fun addition(): Int {
        total += num1
        total2 += num2
        total3 = total + total2
        println("The total amount you entered is $total3")
        println()
        return total3
    }

    fun division(): Int {
        finalAmount = num1 / divisor
        println("The final answer is $finalAmount")
        return finalAmount
    }
}
