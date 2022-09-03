fun main() {
    //1st comment
    //2nd comment
    //3rd comment to document code
    /*
        Author: Lugin Paul Arguez
        Date Created: 9/1/2022
        Filename: FirstKotlinProgram.kt
     */
    var firstName : String = "Lugin"
    firstName = "Paul"
    var age : Int = 37
    var grade : Double = 99.00
    var section : Char = 'A'
    var isEnrolled : Boolean = true

    println("My Name is $firstName")
    print("My Age is $grade")
    println(" my grade is grade")
    println(section)
    println(isEnrolled)

    println("Enter your name:")
    var name : String = readln()

    println("My Name is $name")

    println("Enter your number:")
    var number : Int = readln().toInt()

    println("My number is $number")

    println("Enter your number 1:")
    var number1 : Int = readln().toInt()

    println("Enter your number 2:")
    var number2 : Int = readln().toInt()

    var sum : Int = number1 + number2

    print("The sum is $sum")

    println("Hello Good Morning!")
}