fun main(){

    println("Enter number 1:")
    var number: Int = readln().toInt()

    println("The cube is ${number * number * number}")

    println("Enter number 2:")
    var number2: Int = readln().toInt()

    println("The cube is ${number2 * number * number2}")

    displayName()

    displayMessage("Hello!")

    displayNameAndAge("John", 18)

    println()

    println("Enter your name:")
    var name: String = readln()

    println("Enter your age:")
    var age: Int = readln().toInt()

    displayNameAndAge(name,age)

}

//function with no return parameter
// "fun" is a way of saying that we are declaring a function; "displayName" is a sample of the function
//all functions only run in the "exercises.Activity04A.main"

//fun displayName(): Unit {


//also the foloowing is the same

fun displayName(){
    println("Peter")
}

//no return with 1 parameter
fun displayMessage(msg: String){
    println("The message is \"$msg\".")
}

//no return with 2 parameter
fun displayNameAndAge(name: String, age: Int){
    println("Your name is $name.")
    println("Your age is $age.")
}
