fun main(){

    println("Enter number 1:")
    var number: Int = readln().toInt()

    println("The cube is ${number * number * number}")

    println("Enter number 2:")
    var number2: Int = readln().toInt()

    println("The cube is ${number2 * number * number2}")

    displayName()

    displayMessage("Hello!")

}

//function with no return parameter
// "fun" is a way of saying that we are declaring a function; "displayName" is a sample of the function
//all functions only run in the "main"

//fun displayName(): Unit {


//also the foloowing is the same

fun displayName(){
    println("Peter")
}

//no return with 1 parameter
fun displayMessage(msg: String){
    println("The message is \"$msg\".")
}


