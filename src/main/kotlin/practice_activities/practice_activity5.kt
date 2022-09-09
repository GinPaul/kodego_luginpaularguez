package practice_activities

fun main(){

    //given variables
    var number1: Int = 0
    var number2: Int = 0
    var number3: Int = 0
    var number4: Int = 0
    var number5: Int = 0

    //enter number
    println("Enter the first number:")
    number1 = readln().toInt()

    println("Enter the second number:")
    number2 = readln().toInt()

    println("Enter the third number:")
    number3 = readln().toInt()

    println("Enter the fourth number:")
    number4 = readln().toInt()

    println("Enter the fifth number:")
    number5 = readln().toInt()

    var numbers = arrayListOf<Int>(number1, number2, number3, number4, number5)

    //list characters
    for (char in numbers){print(char)}

    println()

    //reverse
    println(numbers.reversed())


}