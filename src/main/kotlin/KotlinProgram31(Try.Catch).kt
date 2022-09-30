fun main(){

    try {
        println("Enter number 1:")
        var num1: Int = readln().toInt()
    }catch(e:Exception){
        println("Invalid input. Digits only!")
    }
    println("~End of Code~")


//
//    var numbers = arrayOf<Int>(4,2,1)
//
//    println(2/0)



}

//Exception - if we run the above it will be an error if the user will enter String.
//Exceptions are those that disrupt the normal flow of your code
//Exceptions are recoverable (meaning we can handle it)

//Errors - are unrecoverable

//try - catch block >> the basic way of handling exception to return the code to the normal execution