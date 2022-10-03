package exercises

import mu.KotlinLogging
private val logger = KotlinLogging.logger {}

fun main() {
//    var num1: Int = 0
//    var num2: Int = 0

    var inputText: String = ""

    var finalAnswer = OperationSumAndDivision(0, 0)

    //step 1 with try catch for invalid input
    do{
        try {
            println("Please enter an amount:")
            finalAnswer.num1 = readln().toInt() //putting "finalAnswer" variable name will add num1 to the variable finalAnswer=OperationSumAndDivision()
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
                    finalAnswer.num2 = readln().toInt()
                    finalAnswer.num1 += finalAnswer.num2
                } catch (e: NumberFormatException) {
                    println(e)
                    println("Invalid input. Try again.")
                }
            } while (false)
            println("The amount you entered is ${finalAnswer.num2}")
        } else if (inputText == "N") {
            break
        } else
            println("Invalid input. Please try again.")
    } while (inputText !== "N")


    //step 3: call the addition function
    finalAnswer.addition()

    //step 4: exercises.getDivisor input
    println("Divide the total amount by how much?")
    finalAnswer.divisor = readln().toInt()

    //step 5: call the division function
    finalAnswer.division()

    //end
    println()
    println("Thank you for using the service.")

}
class OperationSumAndDivision(num1: Int, num2:Int) {
    var finalAmount: Int = 0
    var num1: Int = num1
    var num2: Int = num2
    var divisor: Int = 0

    init {
        println("Object created!")
        println("Welcome.")
        println()
    }

    fun addition(): Int {
        println("The total amount you entered is $num1")
        println()
        return num1 + num2
    }

    fun division(): Int {
        finalAmount = num1 / divisor
        println("The final answer is $finalAmount")
        return num1/divisor
    }
}
