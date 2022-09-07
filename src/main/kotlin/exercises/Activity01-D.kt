import mu.KotlinLogging
private val logger = KotlinLogging.logger {}

fun main() {

    println("Please enter an amount:")
    var num1: Int = readln().toInt()
    var condition: Boolean = true


    while (condition) {
        println("Do you want to add another amount?")
        var input2: String = readln().uppercase()

        if (input2 == "YES") {
            println("Enter the amount:")
            var input: Int = readln().toInt()
            num1 = num1 + input

            println("The total amount you entered is $num1")
        } else if (input2 == "NO") {
            println("The total amount you entered is $num1")

            println("Divide the total amount by how many?")
            var divisor: Int = readln().toInt()

            var totalAmount: Int = num1 / divisor
            println("The resulting amount is $totalAmount")

            condition = false
        }
    }
}
